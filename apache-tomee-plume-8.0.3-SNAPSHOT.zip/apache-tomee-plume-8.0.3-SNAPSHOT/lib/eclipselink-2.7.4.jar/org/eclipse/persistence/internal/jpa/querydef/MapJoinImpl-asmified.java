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
public class MapJoinImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "<Z:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl<TZ;TV;>;Ljavax/persistence/criteria/MapJoin<TZ;TK;TV;>;", "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", new String[] { "javax/persistence/criteria/MapJoin" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/metamodel/Type$PersistenceType", "javax/persistence/metamodel/Type", "PersistenceType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TV;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/JoinType", "INNER", "Ljavax/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TV;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;Ljavax/persistence/criteria/JoinType;)V", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;Ljavax/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TZ;>;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class<TV;>;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable<TT;>;Ljavax/persistence/criteria/JoinType;Lorg/eclipse/persistence/internal/jpa/querydef/FromImpl;)V", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", "()Ljavax/persistence/metamodel/MapAttribute<-TZ;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "modelArtifact", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/MapAttribute");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "entry", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/util/Map$Entry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/ExpressionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "metamodel", "Ljavax/persistence/metamodel/Metamodel;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Map_Entry_Class", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "mapEntry", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/ExpressionImpl", "<init>", "(Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinKey", "()Ljavax/persistence/criteria/Join;", "()Ljavax/persistence/criteria/Join<Ljava/util/Map<TK;TV;>;TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/JoinType", "INNER", "Ljavax/persistence/criteria/JoinType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "joinKey", "(Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinKey", "(Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", "(Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join<Ljava/util/Map<TK;TV;>;TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getKeyType", "()Ljavax/persistence/metamodel/Type;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/Type", "getPersistenceType", "()Ljavax/persistence/metamodel/Type$PersistenceType;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/Type$PersistenceType", "BASIC", "Ljavax/persistence/metamodel/Type$PersistenceType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/persistence/metamodel/Type$PersistenceType", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("attemped_to_join_basic_key");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getKeyType", "()Ljavax/persistence/metamodel/Type;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "metamodel", "Ljavax/persistence/metamodel/Metamodel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getKeyJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "mapKey", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "key", "()Ljavax/persistence/criteria/Path;", "()Ljavax/persistence/criteria/Path<TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getKeyType", "()Ljavax/persistence/metamodel/Type;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/Type", "getPersistenceType", "()Ljavax/persistence/metamodel/Type$PersistenceType;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/Type$PersistenceType", "BASIC", "Ljavax/persistence/metamodel/Type$PersistenceType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/persistence/metamodel/Type$PersistenceType", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/PathImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "metamodel", "Ljavax/persistence/metamodel/Metamodel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "modelArtifact", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/MapAttribute");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getKeyJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "mapKey", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/PathImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getKeyType", "()Ljavax/persistence/metamodel/Type;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/ManagedType");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "metamodel", "Ljavax/persistence/metamodel/Metamodel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/metamodel/MapAttribute", "getKeyJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "currentNode", "Lorg/eclipse/persistence/expressions/Expression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "mapKey", "()Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "<init>", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/metamodel/Metamodel;Ljava/lang/Class;Lorg/eclipse/persistence/expressions/Expression;Ljavax/persistence/metamodel/Bindable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 1);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl<TZ;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl<TZ;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/JoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/MapJoin;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "on", "([Ljavax/persistence/criteria/Predicate;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/MapJoin;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/JoinImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "on", "(Ljavax/persistence/criteria/Expression;)Lorg/eclipse/persistence/internal/jpa/querydef/MapJoinImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/PluralAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/Bindable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/querydef/MapJoinImpl", "getModel", "()Ljavax/persistence/metamodel/MapAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
