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
public class FromImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/criteria/FromImpl", "<Z:Ljava/lang/Object;X:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/criteria/PathImpl<TZ;TX;>;Ljakarta/persistence/criteria/From<TZ;TX;>;", "org/apache/openjpa/persistence/criteria/PathImpl", new String[] { "jakarta/persistence/criteria/From" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$Member", "org/apache/openjpa/persistence/meta/Members", "Member", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$SingularJoin", "org/apache/openjpa/persistence/criteria/Joins", "SingularJoin", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$SingularAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "SingularAttributeImpl", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$Collection", "org/apache/openjpa/persistence/criteria/Joins", "Collection", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$CollectionAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "CollectionAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$Set", "org/apache/openjpa/persistence/criteria/Joins", "Set", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$SetAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "SetAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$List", "org/apache/openjpa/persistence/criteria/Joins", "List", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$ListAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "ListAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$Map", "org/apache/openjpa/persistence/criteria/Joins", "Map", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$MapAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "MapAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/persistence/metamodel/Type$PersistenceType", "jakarta/persistence/metamodel/Type", "PersistenceType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_joins", "Ljava/util/Set;", "Ljava/util/Set<Ljakarta/persistence/criteria/Join<TX;*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_fetches", "Ljava/util/Set;", "Ljava/util/Set<Ljakarta/persistence/criteria/Fetch<TX;*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljakarta/persistence/metamodel/Type;", "Ljakarta/persistence/metamodel/Type<TX;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType;)V", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType<TX;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/AbstractManagedType", "getJavaType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PathImpl", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/openjpa/persistence/criteria/PathImpl;Lorg/apache/openjpa/persistence/meta/Members$Member;Ljava/lang/Class;)V", "(Lorg/apache/openjpa/persistence/criteria/PathImpl<*TZ;>;Lorg/apache/openjpa/persistence/meta/Members$Member<-TZ;*>;Ljava/lang/Class<TX;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PathImpl", "<init>", "(Lorg/apache/openjpa/persistence/criteria/PathImpl;Lorg/apache/openjpa/persistence/meta/Members$Member;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/Members$Member", "getType", "()Ljakarta/persistence/metamodel/Type;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljakarta/persistence/metamodel/Type;", "()Ljakarta/persistence/metamodel/Type<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJoins", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/criteria/Join<TX;*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_joins", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "returnCopy", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/SingularAttribute;)Ljakarta/persistence/criteria/Join;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$SingularJoin");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$SingularAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$SingularJoin", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$SingularAttributeImpl;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "addJoin", "(Ljakarta/persistence/criteria/Join;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;)Ljakarta/persistence/criteria/CollectionJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/CollectionAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/CollectionAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$Collection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$CollectionAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$Collection", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$CollectionAttributeImpl;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "addJoin", "(Ljakarta/persistence/criteria/Join;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/SetAttribute;)Ljakarta/persistence/criteria/SetJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SetAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/SetAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/SetAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SetAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$Set");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$SetAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$Set", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$SetAttributeImpl;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "addJoin", "(Ljakarta/persistence/criteria/Join;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/ListAttribute;)Ljakarta/persistence/criteria/ListJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/ListAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/ListAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/ListAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/ListAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$List");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$ListAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$List", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$ListAttributeImpl;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "addJoin", "(Ljakarta/persistence/criteria/Join;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/MapAttribute;)Ljakarta/persistence/criteria/MapJoin;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/MapAttribute<-TX;TK;TV;>;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/MapAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljakarta/persistence/metamodel/MapAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/MapAttribute<-TX;TK;TV;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$Map");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$MapAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$MapAttributeImpl;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "addJoin", "(Ljakarta/persistence/criteria/Join;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljava/lang/String;)Ljakarta/persistence/criteria/Join;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/Join<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getAttribute", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/Attribute;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/Attribute", "getDeclaringType", "()Ljakarta/persistence/metamodel/ManagedType;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/persistence/metamodel/SingularAttribute");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/SingularAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"jakarta/persistence/metamodel/ManagedType", "jakarta/persistence/metamodel/Attribute"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/persistence/metamodel/ListAttribute");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ListAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/ListAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/persistence/metamodel/SetAttribute");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/SetAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/SetAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/persistence/metamodel/CollectionAttribute");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/CollectionAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/persistence/metamodel/MapAttribute");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/MapAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/MapAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinCollection", "(Ljava/lang/String;)Ljakarta/persistence/criteria/CollectionJoin;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/CollectionJoin<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getCollection", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/CollectionAttribute;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinCollection", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getCollection", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/CollectionAttribute;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinList", "(Ljava/lang/String;)Ljakarta/persistence/criteria/ListJoin;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/ListJoin<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getList", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/ListAttribute;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/ListAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinList", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getList", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/ListAttribute;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/ListAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinMap", "(Ljava/lang/String;)Ljakarta/persistence/criteria/MapJoin;", "<W:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/MapJoin<TW;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getMap", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/MapAttribute;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/MapAttribute;)Ljakarta/persistence/criteria/MapJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinMap", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin;", "<W:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin<TW;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getMap", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/MapAttribute;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/MapAttribute;)Ljakarta/persistence/criteria/MapJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinSet", "(Ljava/lang/String;)Ljakarta/persistence/criteria/SetJoin;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/SetJoin<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getSet", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SetAttribute;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/SetAttribute;)Ljakarta/persistence/criteria/SetJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinSet", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin;", "<W:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin<TW;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getSet", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SetAttribute;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "join", "(Ljakarta/persistence/metamodel/SetAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", "(Ljakarta/persistence/metamodel/Type<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/Type", "getPersistenceType", "()Ljakarta/persistence/metamodel/Type$PersistenceType;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Type$PersistenceType", "BASIC", "Ljakarta/persistence/metamodel/Type$PersistenceType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" is a basic path and can not be navigated to ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addJoin", "(Ljakarta/persistence/criteria/Join;)V", "(Ljakarta/persistence/criteria/Join<TX;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_joins", "Ljava/util/Set;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_joins", "Ljava/util/Set;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_joins", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fetch", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$Member");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "addFetch", "(Lorg/apache/openjpa/persistence/meta/Members$Member;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fetch", "(Ljakarta/persistence/metamodel/SingularAttribute;)Ljakarta/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "fetch", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fetch", "(Ljakarta/persistence/metamodel/PluralAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/PluralAttribute<-TX;*TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$Member");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "addFetch", "(Lorg/apache/openjpa/persistence/meta/Members$Member;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fetch", "(Ljakarta/persistence/metamodel/PluralAttribute;)Ljakarta/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/PluralAttribute<-TX;*TY;>;)Ljakarta/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "fetch", "(Ljakarta/persistence/metamodel/PluralAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fetch", "(Ljava/lang/String;)Ljakarta/persistence/criteria/Fetch;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "fetch", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fetch", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "assertJoinable", "(Ljakarta/persistence/metamodel/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "type", "Ljakarta/persistence/metamodel/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/ManagedType", "getAttribute", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/Attribute;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/metamodel/Attribute", "isCollection", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/PluralAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "fetch", "(Ljakarta/persistence/metamodel/PluralAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/persistence/metamodel/Attribute"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/SingularAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "fetch", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFetches", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/criteria/Fetch<TX;*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_fetches", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "returnCopy", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addFetch", "(Lorg/apache/openjpa/persistence/meta/Members$Member;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Lorg/apache/openjpa/persistence/meta/Members$Member<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/FetchPathImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FetchPathImpl", "<init>", "(Ljakarta/persistence/criteria/FetchParent;Lorg/apache/openjpa/persistence/meta/Members$Member;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_fetches", "Ljava/util/Set;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_fetches", "Ljava/util/Set;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/persistence/criteria/Fetch"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_fetches", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptVisit", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_joins", "Ljava/util/Set;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/persistence/criteria/FromImpl", "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor"}, 2, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor", "org/apache/openjpa/persistence/criteria/FromImpl"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_joins", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/FromImpl", "_joins", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/persistence/criteria/FromImpl", "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor"}, 3, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor", "org/apache/openjpa/persistence/criteria/FromImpl", "[Ljakarta/persistence/criteria/Expression;"});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Expressions", "acceptVisit", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor;Lorg/apache/openjpa/persistence/criteria/CriteriaExpression;[Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCorrelationParent", "()Ljakarta/persistence/criteria/From;", "()Ljakarta/persistence/criteria/From<TZ;TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/FromImpl", "getCorrelatedPath", "()Lorg/apache/openjpa/persistence/criteria/PathImpl;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/criteria/From");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
