package asm.org.apache.cxf.jaxrs.ext.search.jpa;
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
public class JPACriteriaQueryVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "<T:Ljava/lang/Object;E:Ljava/lang/Object;>Lorg/apache/cxf/jaxrs/ext/search/jpa/AbstractJPATypedQueryVisitor<TT;TE;Ljavax/persistence/criteria/CriteriaQuery<TE;>;>;", "org/apache/cxf/jaxrs/ext/search/jpa/AbstractJPATypedQueryVisitor", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;)V", "(Ljavax/persistence/EntityManager;Ljava/lang/Class<TT;>;Ljava/lang/Class<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;)V", "(Ljavax/persistence/EntityManager;Ljava/lang/Class<TT;>;Ljava/lang/Class<TE;>;Ljava/util/List<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V", "(Ljavax/persistence/EntityManager;Ljava/lang/Class<TT;>;Ljava/lang/Class<TE;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/AbstractJPATypedQueryVisitor", "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)V", "(Ljavax/persistence/EntityManager;Ljava/lang/Class<TT;>;Ljava/lang/Class<TE;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/AbstractJPATypedQueryVisitor", "<init>", "(Ljavax/persistence/EntityManager;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", "()Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "count", "()Ljava/lang/Long;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/AbstractJPATypedQueryVisitor", "getQueryClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Query class needs to be of type Long");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaBuilder", "()Ljavax/persistence/criteria/CriteriaBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getRoot", "()Ljavax/persistence/criteria/Root;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaBuilder", "count", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "select", "(Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/AbstractJPATypedQueryVisitor", "getEntityManager", "()Ljavax/persistence/EntityManager;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "createQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "getSingleResult", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrderedTypedQuery", "(Ljava/util/List;Z)Ljavax/persistence/TypedQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;Z)Ljavax/persistence/TypedQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "orderBy", "(Ljava/util/List;Z)Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getTypedQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)Ljavax/persistence/TypedQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "(Ljava/util/List;Z)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;Z)Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaBuilder", "()Ljavax/persistence/criteria/CriteriaBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"javax/persistence/criteria/CriteriaBuilder", "java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/SingularAttribute");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getRoot", "()Ljavax/persistence/criteria/Root;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Root", "get", "(Ljavax/persistence/metamodel/SingularAttribute;)Ljavax/persistence/criteria/Path;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaBuilder", "asc", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Order;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/persistence/metamodel/SingularAttribute", "javax/persistence/criteria/Path"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaBuilder", "desc", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Order;", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/persistence/criteria/Order"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "orderBy", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getArrayTypedQuery", "(Ljava/util/List;)Ljavax/persistence/TypedQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;)Ljavax/persistence/TypedQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsList", "(Ljava/util/List;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsArray", "(Ljava/util/List;)[Ljavax/persistence/criteria/Selection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "selectArraySelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getTypedQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)Ljavax/persistence/TypedQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectArray", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;)Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsList", "(Ljava/util/List;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsArray", "(Ljava/util/List;)[Ljavax/persistence/criteria/Selection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "selectArraySelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "selectArraySelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaBuilder", "()Ljavax/persistence/criteria/CriteriaBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaBuilder", "array", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "select", "(Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectConstruct", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;)Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsList", "(Ljava/util/List;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsArray", "(Ljava/util/List;)[Ljavax/persistence/criteria/Selection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "selectConstructSelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstructTypedQuery", "(Ljava/util/List;)Ljavax/persistence/TypedQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;)Ljavax/persistence/TypedQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsList", "(Ljava/util/List;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsArray", "(Ljava/util/List;)[Ljavax/persistence/criteria/Selection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "selectConstructSelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getTypedQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)Ljavax/persistence/TypedQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "selectConstructSelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaBuilder", "()Ljavax/persistence/criteria/CriteriaBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQueryClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaBuilder", "construct", "(Ljava/lang/Class;[Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "select", "(Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectTuple", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;)Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsList", "(Ljava/util/List;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsArray", "(Ljava/util/List;)[Ljavax/persistence/criteria/Selection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "selectTupleSelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTupleTypedQuery", "(Ljava/util/List;)Ljavax/persistence/TypedQuery;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;)Ljavax/persistence/TypedQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsList", "(Ljava/util/List;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "toSelectionsArray", "(Ljava/util/List;)[Ljavax/persistence/criteria/Selection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "selectTupleSelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getTypedQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)Ljavax/persistence/TypedQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "selectTupleSelections", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CriteriaQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getCriteriaBuilder", "()Ljavax/persistence/criteria/CriteriaBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaBuilder", "tuple", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "select", "(Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "toSelectionsList", "(Ljava/util/List;Z)Ljava/util/List;", "(Ljava/util/List<Ljavax/persistence/metamodel/SingularAttribute<TT;*>;>;Z)Ljava/util/List<Ljavax/persistence/criteria/Selection<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/SingularAttribute");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getRoot", "()Ljavax/persistence/criteria/Root;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Root", "get", "(Ljavax/persistence/metamodel/SingularAttribute;)Ljavax/persistence/criteria/Path;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/SingularAttribute", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Path", "alias", "(Ljava/lang/String;)Ljavax/persistence/criteria/Selection;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "toSelectionsArray", "(Ljava/util/List;)[Ljavax/persistence/criteria/Selection;", "(Ljava/util/List<Ljavax/persistence/criteria/Selection<*>;>;)[Ljavax/persistence/criteria/Selection<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/persistence/criteria/Selection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/persistence/criteria/Selection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTypedQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)Ljavax/persistence/TypedQuery;", "(Ljavax/persistence/criteria/CriteriaQuery<TE;>;)Ljavax/persistence/TypedQuery<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/jpa/AbstractJPATypedQueryVisitor", "getEntityManager", "()Ljavax/persistence/EntityManager;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "createQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getQuery", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/jpa/JPACriteriaQueryVisitor", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
