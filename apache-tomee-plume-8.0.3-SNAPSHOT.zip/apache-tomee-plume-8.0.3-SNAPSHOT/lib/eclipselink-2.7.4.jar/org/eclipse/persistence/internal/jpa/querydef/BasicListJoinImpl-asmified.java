package asm.org.eclipse.persistence.internal.jpa.querydef;
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
public class BasicListJoinImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/querydef/BasicListJoinImpl", "<Z:Ljava/lang/Object;E:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl<TZ;TE;>;", "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TE;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/JoinType", "INNER", "Ljavax/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/BasicListJoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", "<C:Ljava/lang/Object;T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TE;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;Ljavax/persistence/criteria/JoinType;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljavax/persistence/metamodel/SingularAttribute;)Ljavax/persistence/criteria/Path;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TE;TY;>;)Ljavax/persistence/criteria/Path<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljavax/persistence/metamodel/PluralAttribute;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;C::Ljava/util/Collection<TY;>;>(Ljavax/persistence/metamodel/PluralAttribute<TE;TC;TY;>;)Ljavax/persistence/criteria/Expression<TC;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljavax/persistence/metamodel/MapAttribute;)Ljavax/persistence/criteria/Expression;", "<L:Ljava/lang/Object;W:Ljava/lang/Object;M::Ljava/util/Map<TL;TW;>;>(Ljavax/persistence/metamodel/MapAttribute<TE;TL;TW;>;)Ljavax/persistence/criteria/Expression<TM;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "type", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/lang/Class<+TE;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_type_does_not_apply");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/String;)Ljavax/persistence/criteria/Path;", "<Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/Path<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljavax/persistence/metamodel/SingularAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TE;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljavax/persistence/metamodel/CollectionAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/CollectionAttribute<-TE;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljavax/persistence/metamodel/SetAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SetAttribute<-TE;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljavax/persistence/metamodel/ListAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/ListAttribute<-TE;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljavax/persistence/metamodel/MapAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin;", "<L:Ljava/lang/Object;W:Ljava/lang/Object;>(Ljavax/persistence/metamodel/MapAttribute<-TE;TL;TW;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin<TE;TL;TW;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "join", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", "<E:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinCollection", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin;", "<E:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinList", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin;", "<E:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinMap", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin;", "<E:Ljava/lang/Object;L:Ljava/lang/Object;W:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin<TE;TL;TW;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinSet", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin;", "<E:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin<TE;TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pathnode_is_primitive_node");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
