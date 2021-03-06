package asm.org.apache.openjpa.jdbc.kernel.exps;
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
public class CompareEqualExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/kernel/exps/Exp" });

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_loc", "Lorg/apache/openjpa/lib/util/Localizer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/jdbc/kernel/exps/Val;Lorg/apache/openjpa/jdbc/kernel/exps/Val;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/Lit");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/Lit");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/Lit");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/Lit", "setRaw", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/Lit");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/Lit", "setRaw", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "org/apache/openjpa/jdbc/kernel/exps/Val", "org/apache/openjpa/jdbc/kernel/exps/Val"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue1", "()Lorg/apache/openjpa/jdbc/kernel/exps/Val;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue2", "()Lorg/apache/openjpa/jdbc/kernel/exps/Val;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Ljava/util/Map;)Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "isDirectComparison", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/Const");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "initialize", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;I)Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/Const");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/Const", "getValue", "(Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "org/apache/openjpa/jdbc/sql/Select", "org/apache/openjpa/jdbc/kernel/exps/ExpContext", "java/util/Map", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "org/apache/openjpa/jdbc/kernel/exps/ExpState", "org/apache/openjpa/jdbc/kernel/exps/ExpState"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/Const");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "initialize", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;I)Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/Const");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/Const", "getValue", "(Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/PCPath");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/PCPath");
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/PCPath");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/PCPath", "isSubqueryPath", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/PCPath");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/PCPath", "isSubqueryPath", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "initialize", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;I)Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "initialize", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;I)Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/ExpState", "joins", "Lorg/apache/openjpa/jdbc/sql/Joins;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/ExpState", "joins", "Lorg/apache/openjpa/jdbc/sql/Joins;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Select", "and", "(Lorg/apache/openjpa/jdbc/sql/Joins;Lorg/apache/openjpa/jdbc/sql/Joins;)Lorg/apache/openjpa/jdbc/sql/Joins;", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "<init>", "(Lorg/apache/openjpa/jdbc/sql/Joins;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendTo", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;Lorg/apache/openjpa/jdbc/sql/SQLBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state1", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state2", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "calculateValue", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;Lorg/apache/openjpa/jdbc/kernel/exps/Val;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state2", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state1", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "calculateValue", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;Lorg/apache/openjpa/jdbc/kernel/exps/Val;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "getType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "getType", "()Ljava/lang/Class;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/Filters", "canConvert", "(Ljava/lang/Class;Ljava/lang/Class;Z)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "getType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "getType", "()Ljava/lang/Class;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/Filters", "canConvert", "(Ljava/lang/Class;Ljava/lang/Class;Z)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UserException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("cant-convert");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "getType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "getType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UserException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/Const");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/Const");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state1", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/Const", "isSQLValueNull", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/jdbc/kernel/exps/Const");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/Const");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state2", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/Const", "isSQLValueNull", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "appendTo", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState;Lorg/apache/openjpa/jdbc/sql/SQLBuffer;ZZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/ExpState", "joins", "Lorg/apache/openjpa/jdbc/sql/Joins;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Select", "append", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectColumns", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state1", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "selectColumns", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;Z)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState", "state2", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "selectColumns", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "appendTo", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;Lorg/apache/openjpa/jdbc/kernel/exps/BinaryOpExpState;Lorg/apache/openjpa/jdbc/sql/SQLBuffer;ZZ)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isDirectComparison", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptVisit", "(Lorg/apache/openjpa/kernel/exps/ExpressionVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionVisitor", "enter", "(Lorg/apache/openjpa/kernel/exps/Expression;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val1", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "acceptVisit", "(Lorg/apache/openjpa/kernel/exps/ExpressionVisitor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_val2", "Lorg/apache/openjpa/jdbc/kernel/exps/Val;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/kernel/exps/Val", "acceptVisit", "(Lorg/apache/openjpa/kernel/exps/ExpressionVisitor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/ExpressionVisitor", "exit", "(Lorg/apache/openjpa/kernel/exps/Expression;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/kernel/exps/CompareEqualExpression", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
