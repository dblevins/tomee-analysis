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
public class JoinsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/openjpa/persistence/criteria/Joins", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$KeyJoin", "org/apache/openjpa/persistence/criteria/Joins", "KeyJoin", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$MapEntry", "org/apache/openjpa/persistence/criteria/Joins", "MapEntry", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$MapKey", "org/apache/openjpa/persistence/criteria/Joins", "MapKey", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$Map", "org/apache/openjpa/persistence/criteria/Joins", "Map", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$List", "org/apache/openjpa/persistence/criteria/Joins", "List", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$Set", "org/apache/openjpa/persistence/criteria/Joins", "Set", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$Collection", "org/apache/openjpa/persistence/criteria/Joins", "Collection", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$AbstractCollection", "org/apache/openjpa/persistence/criteria/Joins", "AbstractCollection", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Joins$SingularJoin", "org/apache/openjpa/persistence/criteria/Joins", "SingularJoin", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$Member", "org/apache/openjpa/persistence/meta/Members", "Member", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$SingularAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "SingularAttributeImpl", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$CollectionAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "CollectionAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$ListAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "ListAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$SetAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "SetAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$MapAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "MapAttributeImpl", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "clone", "(Ljavax/persistence/criteria/Join;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/PathImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Joins", "getMembers", "(Lorg/apache/openjpa/persistence/criteria/PathImpl;Ljava/util/List;Ljava/util/List;)Lorg/apache/openjpa/persistence/criteria/FromImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$Member");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/criteria/JoinType");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Joins", "makeJoin", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$Member;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"javax/persistence/criteria/Join", "java/util/List", "java/util/List", "org/apache/openjpa/persistence/criteria/FromImpl", "org/apache/openjpa/persistence/meta/Members$Member", "javax/persistence/criteria/JoinType", "javax/persistence/criteria/Join", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/FromImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$Member");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/criteria/JoinType");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Joins", "makeJoin", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$Member;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "makeJoin", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$Member;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", "(Lorg/apache/openjpa/persistence/criteria/FromImpl<**>;Lorg/apache/openjpa/persistence/meta/Members$Member;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join<**>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/meta/Members$SingularAttributeImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$SingularJoin");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$SingularAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$SingularJoin", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$SingularAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/meta/Members$CollectionAttributeImpl");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$Collection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$CollectionAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$Collection", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$CollectionAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/meta/Members$ListAttributeImpl");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$List");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$ListAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$List", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$ListAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/meta/Members$SetAttributeImpl");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$Set");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$SetAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$Set", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$SetAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/meta/Members$MapAttributeImpl");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Joins$Map");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/Members$MapAttributeImpl");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Joins$Map", "<init>", "(Lorg/apache/openjpa/persistence/criteria/FromImpl;Lorg/apache/openjpa/persistence/meta/Members$MapAttributeImpl;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getMembers", "(Lorg/apache/openjpa/persistence/criteria/PathImpl;Ljava/util/List;Ljava/util/List;)Lorg/apache/openjpa/persistence/criteria/FromImpl;", "(Lorg/apache/openjpa/persistence/criteria/PathImpl;Ljava/util/List<Lorg/apache/openjpa/persistence/meta/Members$Member;>;Ljava/util/List<Ljavax/persistence/criteria/JoinType;>;)Lorg/apache/openjpa/persistence/criteria/FromImpl;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/PathImpl", "getParentPath", "()Ljavax/persistence/criteria/Path;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/PathImpl");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/PathImpl", "getMember", "()Lorg/apache/openjpa/persistence/meta/Members$Member;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/criteria/Join");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Join", "getJoinType", "()Ljavax/persistence/criteria/JoinType;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/criteria/RootImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/FromImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openjpa/persistence/criteria/PathImpl", "java/util/List", "java/util/List", "org/apache/openjpa/persistence/criteria/PathImpl", "org/apache/openjpa/persistence/meta/Members$Member", "javax/persistence/criteria/JoinType", "org/apache/openjpa/persistence/criteria/FromImpl"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/Joins", "getMembers", "(Lorg/apache/openjpa/persistence/criteria/PathImpl;Ljava/util/List;Ljava/util/List;)Lorg/apache/openjpa/persistence/criteria/FromImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
