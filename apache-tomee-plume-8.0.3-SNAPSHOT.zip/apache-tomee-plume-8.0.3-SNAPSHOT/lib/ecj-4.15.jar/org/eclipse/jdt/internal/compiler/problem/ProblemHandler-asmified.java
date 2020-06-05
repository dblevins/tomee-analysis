package asm.org.eclipse.jdt.internal.compiler.problem;
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
public class ProblemHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NoArgument", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "problemFactory", "Lorg/eclipse/jdt/internal/compiler/IProblemFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rootPolicy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "suppressTagging", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "NO_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "NoArgument", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;Lorg/eclipse/jdt/internal/compiler/IProblemFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "suppressTagging", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "problemFactory", "Lorg/eclipse/jdt/internal/compiler/IProblemFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "computeSeverity", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProblem", "([CI[Ljava/lang/String;[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "problemFactory", "Lorg/eclipse/jdt/internal/compiler/IProblemFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/IProblemFactory", "createProblem", "([CI[Ljava/lang/String;[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProblem", "([CI[Ljava/lang/String;I[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "problemFactory", "Lorg/eclipse/jdt/internal/compiler/IProblemFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/IProblemFactory", "createProblem", "([CI[Ljava/lang/String;I[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(11, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handle", "(I[Ljava/lang/String;I[Ljava/lang/String;IIILorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/AbstractMethodError");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 256);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitInsn(IAND);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/IErrorHandlingPolicy", "ignoreAllErrors", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IAND);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "createProblem", "([CI[Ljava/lang/String;I[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/problem/AbortCompilation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/problem/AbortCompilation", "<init>", "(Lorg/eclipse/jdt/internal/compiler/CompilationResult;Lorg/eclipse/jdt/core/compiler/CategorizedProblem;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/impl/ReferenceContext", "tagAsHavingIgnoredMandatoryErrors", "(I)V", true);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(IAND);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(536871362));
methodVisitor.visitJumpInsn(IF_ICMPEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "ignoreSourceFolderWarningOption", "Z");
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "getCompilationUnit", "()Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/env/ICompilationUnit", "ignoreOptionalProblems", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/eclipse/jdt/internal/compiler/problem/ProblemHandler", Opcodes.INTEGER, "[Ljava/lang/String;", Opcodes.INTEGER, "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "org/eclipse/jdt/internal/compiler/impl/ReferenceContext", "org/eclipse/jdt/internal/compiler/CompilationResult", Opcodes.INTEGER, "org/eclipse/jdt/internal/compiler/env/ICompilationUnit"}, 1, new Object[] {"java/lang/AbstractMethodError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label11);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IAND);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "createProblem", "([CI[Ljava/lang/String;I[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/problem/AbortCompilation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/problem/AbortCompilation", "<init>", "(Lorg/eclipse/jdt/internal/compiler/CompilationResult;Lorg/eclipse/jdt/core/compiler/CategorizedProblem;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFLT, label13);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "getLineSeparatorPositions", "()[I", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/util/Util", "getLineNumber", "(I[III)I", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFLT, label15);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "getLineSeparatorPositions", "()[I", false);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/util/Util", "searchColumnNumber", "([III)I", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/eclipse/jdt/internal/compiler/problem/ProblemHandler", Opcodes.INTEGER, "[Ljava/lang/String;", Opcodes.INTEGER, "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "org/eclipse/jdt/internal/compiler/impl/ReferenceContext", "org/eclipse/jdt/internal/compiler/CompilationResult", Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "getFileName", "()[C", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "createProblem", "([CI[Ljava/lang/String;I[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 14);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label17);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "org/eclipse/jdt/core/compiler/CategorizedProblem"}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IAND);
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
methodVisitor.visitTableSwitchInsn(0, 1, label20, new Label[] { label18, label19 });
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "record", "(Lorg/eclipse/jdt/core/compiler/CategorizedProblem;Lorg/eclipse/jdt/internal/compiler/CompilationResult;Lorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;Z)V", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitInsn(IAND);
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/impl/ReferenceContext", "hasErrors", "()Z", true);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNE, label21);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitJumpInsn(IFNE, label21);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "suppressOptionalErrors", "Z");
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/impl/ReferenceContext", "getCompilationUnitDeclaration", "()Lorg/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration;", true);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitJumpInsn(IFNULL, label21);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration", "isSuppressed", "(Lorg/eclipse/jdt/core/compiler/CategorizedProblem;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "suppressTagging", "Z");
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label22);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "treatOptionalErrorAsFatal", "Z");
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label23);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/impl/ReferenceContext", "tagAsHavingErrors", "()V", true);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/IErrorHandlingPolicy", "stopOnFirstError", "()Z", true);
Label label24 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label24);
methodVisitor.visitInsn(ICONST_2);
Label label25 = new Label();
methodVisitor.visitJumpInsn(GOTO, label25);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitInsn(IAND);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 15);
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 15);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/impl/ReferenceContext", "abort", "(ILorg/eclipse/jdt/core/compiler/CategorizedProblem;)V", true);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "record", "(Lorg/eclipse/jdt/core/compiler/CategorizedProblem;Lorg/eclipse/jdt/internal/compiler/CompilationResult;Lorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;Z)V", false);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 16);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handle", "(I[Ljava/lang/String;[Ljava/lang/String;IILorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "computeSeverity", "(I)I", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "handle", "(I[Ljava/lang/String;I[Ljava/lang/String;IIILorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "record", "(Lorg/eclipse/jdt/core/compiler/CategorizedProblem;Lorg/eclipse/jdt/internal/compiler/CompilationResult;Lorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "record", "(Lorg/eclipse/jdt/core/compiler/CategorizedProblem;Lorg/eclipse/jdt/internal/compiler/impl/ReferenceContext;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "switchErrorHandlingPolicy", "(Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;)Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "rootPolicy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "rootPolicy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "suspendTempErrorHandlingPolicy", "()Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "rootPolicy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "rootPolicy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/internal/compiler/IErrorHandlingPolicy"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resumeTempErrorHandlingPolicy", "(Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemHandler", "policy", "Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}