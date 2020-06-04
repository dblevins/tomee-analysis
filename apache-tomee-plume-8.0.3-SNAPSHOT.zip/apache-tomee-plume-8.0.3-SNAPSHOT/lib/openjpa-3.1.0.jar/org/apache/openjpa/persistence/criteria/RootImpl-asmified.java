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
public class RootImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/criteria/RootImpl", "<X:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/criteria/FromImpl<TX;TX;>;Ljavax/persistence/criteria/Root<TX;>;", "org/apache/openjpa/persistence/criteria/FromImpl", new String[] { "javax/persistence/criteria/Root" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Types$Entity", "org/apache/openjpa/persistence/meta/Types", "Entity", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;", "Lorg/apache/openjpa/persistence/meta/Types$Entity<TX;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/persistence/meta/Types$Entity;)V", "(Lorg/apache/openjpa/persistence/meta/Types$Entity<TX;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/FromImpl", "<init>", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModel", "()Ljavax/persistence/metamodel/EntityType;", "()Ljavax/persistence/metamodel/EntityType<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToContext", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/meta/MetamodelImpl;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)V", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/meta/MetamodelImpl;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getAlias", "(Ljavax/persistence/criteria/Selection;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/exps/AbstractExpressionBuilder", "TYPE_OBJECT", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "newBoundVariable", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Types$Entity", "meta", "Lorg/apache/openjpa/meta/ClassMetaData;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/Value", "setMetaData", "(Lorg/apache/openjpa/meta/ClassMetaData;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "ctx", "()Lorg/apache/openjpa/kernel/exps/Context;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Types$Entity", "meta", "Lorg/apache/openjpa/meta/ClassMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/exps/Context", "addSchema", "(Ljava/lang/String;Lorg/apache/openjpa/meta/ClassMetaData;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/exps/Context", "addVariable", "(Ljava/lang/String;Lorg/apache/openjpa/kernel/exps/Value;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/Context", "schemaAlias", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/Context", "schemaAlias", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "org/apache/openjpa/kernel/exps/Value", "org/apache/openjpa/kernel/exps/Context"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toValue", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Value;", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl<*>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getDelegator", "()Lorg/apache/openjpa/persistence/criteria/SubqueryImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getAlias", "(Ljavax/persistence/criteria/Selection;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "ctx", "()Lorg/apache/openjpa/kernel/exps/Context;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "ctx", "()Lorg/apache/openjpa/kernel/exps/Context;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/Context", "schemaAlias", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getRegisteredRootVariable", "(Ljavax/persistence/criteria/Root;)Lorg/apache/openjpa/kernel/exps/Value;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "newPath", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Path;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openjpa/persistence/criteria/RootImpl", "org/apache/openjpa/kernel/exps/ExpressionFactory", "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "org/apache/openjpa/persistence/criteria/SubqueryImpl", "org/apache/openjpa/kernel/exps/Path", "org/apache/openjpa/kernel/exps/Value", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/RootImpl", "inSubquery", "(Lorg/apache/openjpa/persistence/criteria/SubqueryImpl;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/SubqueryImpl", "getSubQ", "()Lorg/apache/openjpa/kernel/exps/Subquery;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "newPath", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Path;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "newPath", "()Lorg/apache/openjpa/kernel/exps/Path;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/Path", "setSchemaAlias", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Types$Entity", "meta", "Lorg/apache/openjpa/meta/ClassMetaData;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/Path", "setMetaData", "(Lorg/apache/openjpa/meta/ClassMetaData;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toKernelExpression", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Expression;", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl<*>;)Lorg/apache/openjpa/kernel/exps/Expression;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/RootImpl", "toValue", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)Lorg/apache/openjpa/kernel/exps/Value;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getAlias", "(Ljavax/persistence/criteria/Selection;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Types$Entity", "meta", "Lorg/apache/openjpa/meta/ClassMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "newBoundVariable", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", "bindVariable", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asValue", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/AliasContext", "getRegisteredRootVariable", "(Ljavax/persistence/criteria/Root;)Lorg/apache/openjpa/kernel/exps/Value;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/Value", "getAlias", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/kernel/exps/Value"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/AliasContext", "getRegisteredValue", "(Ljavax/persistence/criteria/Selection;)Lorg/apache/openjpa/kernel/exps/Value;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/Value", "getAlias", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/AliasContext", "isRegistered", "(Ljavax/persistence/criteria/Selection;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/criteria/AliasContext", "getRegisteredValue", "(Ljavax/persistence/criteria/Selection;)Lorg/apache/openjpa/kernel/exps/Value;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/Value", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/Types$Entity", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "toLowerCase", "(C)C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asVariable", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/RootImpl", "_entity", "Lorg/apache/openjpa/persistence/meta/Types$Entity;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/Types$Entity", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/RootImpl", "asValue", "(Lorg/apache/openjpa/persistence/criteria/AliasContext;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/Bindable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/RootImpl", "getModel", "()Ljavax/persistence/metamodel/EntityType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
