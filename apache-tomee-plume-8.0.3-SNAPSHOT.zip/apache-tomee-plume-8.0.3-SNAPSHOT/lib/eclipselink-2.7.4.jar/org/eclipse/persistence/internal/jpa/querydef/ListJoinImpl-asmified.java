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
public class ListJoinImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "<Z:Ljava/lang/Object;X:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl<TZ;TX;>;Ljakarta/persistence/criteria/ListJoin<TZ;TX;>;", "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", new String[] { "jakarta/persistence/criteria/ListJoin" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/persistence/criteria/Path;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable;)V", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Path<TZ;>;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/JoinType", "INNER", "Ljakarta/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "<init>", "(Ljakarta/persistence/criteria/Path;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/persistence/criteria/Path;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable;Ljakarta/persistence/criteria/JoinType;)V", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Path<TZ;>;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable<TT;>;Ljakarta/persistence/criteria/JoinType;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "<init>", "(Ljakarta/persistence/criteria/Path;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable;Ljakarta/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/persistence/criteria/Path;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable;Ljakarta/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Path<TZ;>;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable<TT;>;Ljakarta/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "<init>", "(Ljakarta/persistence/criteria/Path;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljakarta/persistence/metamodel/Bindable;Ljakarta/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModel", "()Ljakarta/persistence/metamodel/ListAttribute;", "()Ljakarta/persistence/metamodel/ListAttribute<-TZ;TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "modelArtifact", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/ListAttribute");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "index", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/ExpressionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "metamodel", "Ljakarta/persistence/metamodel/Metamodel;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "INTEGER", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "index", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/ExpressionImpl", "<init>", "(Ljakarta/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "on", "(Ljakarta/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl<TZ;TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "on", "(Ljakarta/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "on", "([Ljakarta/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", "([Ljakarta/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl<TZ;TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "on", "([Ljakarta/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/ListJoin;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "on", "([Ljakarta/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljakarta/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "on", "([Ljakarta/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "on", "([Ljakarta/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/ListJoin;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "on", "(Ljakarta/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljakarta/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "on", "(Ljakarta/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "on", "(Ljakarta/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/ListJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljakarta/persistence/metamodel/PluralAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "getModel", "()Ljakarta/persistence/metamodel/ListAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljakarta/persistence/metamodel/Bindable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/ListJoinImpl", "getModel", "()Ljakarta/persistence/metamodel/ListAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
