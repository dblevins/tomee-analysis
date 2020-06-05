package asm.org.eclipse.jdt.internal.compiler.ast;
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
public class ReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/jdt/internal/compiler/ast/Reference", null, "org/eclipse/jdt/internal/compiler/ast/Expression", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/Expression", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "analyseAssignment", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/flow/FlowContext;Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;Lorg/eclipse/jdt/internal/compiler/ast/Assignment;Z)Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "analyseCode", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/flow/FlowContext;Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;)Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkNPE", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/flow/FlowContext;Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/flow/FlowContext", "isNullcheckedFieldAccess", "(Lorg/eclipse/jdt/internal/compiler/ast/Reference;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/Expression", "checkNPE", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/flow/FlowContext;Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkNullableFieldDereference", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;JLorg/eclipse/jdt/internal/compiler/flow/FlowContext;I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "compilerOptions", "()Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "enableSyntacticNullAnalysisForFields", "Z");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/flow/FlowContext", "recordNullCheckedFieldReference", "(Lorg/eclipse/jdt/internal/compiler/ast/Reference;I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "tagBits", "J");
methodVisitor.visitLdcInsn(new Long(36028797018963968L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "environment", "()Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "dereferencingNullableExpression", "(JLorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "isFreeTypeVariable", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "fieldFreeTypeVariableReference", "(Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;J)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "tagBits", "J");
methodVisitor.visitLdcInsn(new Long(36028797018963968L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "nullableFieldDereference", "(Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;J)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fieldBinding", "()Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fieldStore", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;Lorg/eclipse/jdt/internal/compiler/codegen/CodeStream;Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;ZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "position", "I");
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "isStatic", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "id", "I");
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(7, 8, label3, new Label[] { label2, label2 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "dup2", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "dup", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "getConstantPoolDeclaringClass", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Z)Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, -77);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "fieldAccess", "(BLorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, -72);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "invoke", "(BLorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "id", "I");
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTableSwitchInsn(7, 8, label8, new Label[] { label7, label7 });
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "dup2_x1", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "dup_x1", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "getConstantPoolDeclaringClass", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Z)Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, -75);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "fieldAccess", "(BLorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, -72);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "invoke", "(BLorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/Reference", "sourceStart", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/codegen/CodeStream", "recordPositionsFrom", "(II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "generateAssignment", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/codegen/CodeStream;Lorg/eclipse/jdt/internal/compiler/ast/Assignment;Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "generateCompoundAssignment", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/codegen/CodeStream;Lorg/eclipse/jdt/internal/compiler/ast/Expression;IIZ)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "generatePostIncrement", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/codegen/CodeStream;Lorg/eclipse/jdt/internal/compiler/ast/CompoundAssignment;Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEquivalent", "(Lorg/eclipse/jdt/internal/compiler/ast/Reference;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lastFieldBinding", "()Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nullStatus", "(Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;Lorg/eclipse/jdt/internal/compiler/flow/FlowContext;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/Reference", "implicitConversion", "I");
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/Reference", "lastFieldBinding", "()Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "isFinal", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "constant", "()Lorg/eclipse/jdt/internal/compiler/impl/Constant;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/Constant", "NotAConstant", "Lorg/eclipse/jdt/internal/compiler/impl/Constant;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/internal/compiler/lookup/FieldBinding"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "isNonNull", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/flow/FlowContext", "isNullcheckedFieldAccess", "(Lorg/eclipse/jdt/internal/compiler/ast/Reference;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "isNullable", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "type", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "isFreeTypeVariable", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/Reference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/Reference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "tagBits", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/flow/FlowInfo", "tagBitsToNullStatus", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "reportOnlyUselesslyReadPrivateField", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/lookup/FieldBinding;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "compoundUseFlag", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "modifiers", "I");
methodVisitor.visitLdcInsn(new Integer(134217728));
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "modifiers", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "isUsedOnlyInCompound", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "compoundUseFlag", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "compoundUseFlag", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "compoundUseFlag", "I");
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "isOrEnclosedByPrivateType", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/Reference", "implicitConversion", "I");
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitInsn(IAND);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/BlockScope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/FieldBinding", "sourceField", "()Lorg/eclipse/jdt/internal/compiler/ast/FieldDeclaration;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "unusedPrivateField", "(Lorg/eclipse/jdt/internal/compiler/ast/FieldDeclaration;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "reportOnlyUselesslyReadLocal", "(Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;Lorg/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "declaration", "Lorg/eclipse/jdt/internal/compiler/ast/LocalDeclaration;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "declaration", "Lorg/eclipse/jdt/internal/compiler/ast/LocalDeclaration;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/LocalDeclaration", "bits", "I");
methodVisitor.visitLdcInsn(new Integer(1073741824));
methodVisitor.visitInsn(IAND);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "useFlag", "I");
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "useFlag", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "useFlag", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "useFlag", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "useFlag", "I");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "declaration", "Lorg/eclipse/jdt/internal/compiler/ast/LocalDeclaration;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/ast/Argument");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/BlockScope", "methodScope", "()Lorg/eclipse/jdt/internal/compiler/lookup/MethodScope;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/MethodScope", "isLambdaScope", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/MethodScope", "referenceContext", "()Lorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/ast/AbstractMethodDeclaration");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/AbstractMethodDeclaration", "binding", "Lorg/eclipse/jdt/internal/compiler/lookup/MethodBinding;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/MethodBinding", "isMain", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitInsn(ICONST_0);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/jdt/internal/compiler/lookup/MethodScope", "org/eclipse/jdt/internal/compiler/lookup/MethodBinding"}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/MethodBinding", "isImplementing", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/BlockScope", "compilerOptions", "()Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "reportUnusedParameterWhenImplementingAbstract", "Z");
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/MethodBinding", "isOverriding", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/BlockScope", "compilerOptions", "()Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "reportUnusedParameterWhenOverridingConcrete", "Z");
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/BlockScope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "declaration", "Lorg/eclipse/jdt/internal/compiler/ast/LocalDeclaration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "unusedArgument", "(Lorg/eclipse/jdt/internal/compiler/ast/LocalDeclaration;)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/BlockScope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalVariableBinding", "declaration", "Lorg/eclipse/jdt/internal/compiler/ast/LocalDeclaration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "unusedLocalVariable", "(Lorg/eclipse/jdt/internal/compiler/ast/LocalDeclaration;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}