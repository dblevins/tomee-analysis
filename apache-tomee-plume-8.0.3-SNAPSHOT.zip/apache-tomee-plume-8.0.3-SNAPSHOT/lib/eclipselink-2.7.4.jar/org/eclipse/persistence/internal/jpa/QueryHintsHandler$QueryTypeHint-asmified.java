package asm.org.eclipse.persistence.internal.jpa;
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
public class QueryHintsHandler$QueryTypeHintDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTypeHint", null, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "Hint", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTypeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryTypeHint", ACC_PROTECTED | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.query-type");
methodVisitor.visitLdcInsn("Auto");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "applyToDatabaseQuery", "(Ljava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Auto");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("ReadAll");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/ReadAllQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/ReadAllQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/queries/DatabaseQuery"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("ReadObject");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/ReadObjectQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/ReadObjectQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Report");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/ReportQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/ReportQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/DatabaseQuery", "isObjectLevelReadQuery", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/queries/ReportQuery");
methodVisitor.visitLdcInsn("root");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/queries/ReportQuery");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/ReportQuery", "getExpressionBuilder", "()Lorg/eclipse/persistence/expressions/ExpressionBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/ReportQuery", "addAttribute", "(Ljava/lang/String;Lorg/eclipse/persistence/expressions/Expression;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("ResultSetMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/ResultSetMappingQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/ResultSetMappingQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("UpdateAll");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/UpdateAllQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/UpdateAllQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("DeleteAll");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/DeleteAllQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/DeleteAllQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("DataModify");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/DataModifyQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/DataModifyQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("DataRead");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/DataReadQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/DataReadQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("DirectRead");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/DirectReadQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/DirectReadQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("ValueRead");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/ValueReadQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/ValueReadQuery", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTypeHint", "loadClass", "(Ljava/lang/String;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("eclipselink.query-type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTypeHint", "newInstance", "(Ljava/lang/Class;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/queries/DatabaseQuery");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/DatabaseQuery", "copyFromQuery", "(Lorg/eclipse/persistence/queries/DatabaseQuery;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}