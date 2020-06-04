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
public class SetJoinImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "<Z:Ljava/lang/Object;X:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl<TZ;TX;>;Ljavax/persistence/criteria/SetJoin<TZ;TX;>;", "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", new String[] { "javax/persistence/criteria/SetJoin" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/JoinType", "INNER", "Ljavax/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;Ljavax/persistence/criteria/JoinType;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TX;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;Ljavax/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", null);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModel", "()Ljavax/persistence/metamodel/SetAttribute;", "()Ljavax/persistence/metamodel/SetAttribute<-TZ;TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "modelArtifact", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/SetAttribute");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl<TZ;TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl<TZ;TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/SetJoin;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/SetJoin;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/SetJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/PluralAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "getModel", "()Ljavax/persistence/metamodel/SetAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/Bindable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/SetJoinImpl", "getModel", "()Ljavax/persistence/metamodel/SetAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
