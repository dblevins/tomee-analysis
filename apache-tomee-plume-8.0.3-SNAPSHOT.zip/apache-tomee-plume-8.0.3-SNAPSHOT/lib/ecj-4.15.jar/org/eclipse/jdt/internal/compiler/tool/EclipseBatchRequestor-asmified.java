package asm.org.eclipse.jdt.internal.compiler.tool;
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
public class EclipseBatchRequestorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", null, "java/lang/Object", new String[] { "org/eclipse/jdt/internal/compiler/ICompilerRequestor" });

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/batch/Main$Logger", "org/eclipse/jdt/internal/compiler/batch/Main", "Logger", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lineDelta", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "diagnosticListener", "Ljavax/tools/DiagnosticListener;", "Ljavax/tools/DiagnosticListener<-Ljavax/tools/JavaFileObject;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "problemFactory", "Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/batch/Main;Ljavax/tools/DiagnosticListener;Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory;)V", "(Lorg/eclipse/jdt/internal/compiler/batch/Main;Ljavax/tools/DiagnosticListener<-Ljavax/tools/JavaFileObject;>;Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "lineDelta", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "diagnosticListener", "Ljavax/tools/DiagnosticListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "problemFactory", "Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptResult", "(Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/CompilationResult", "lineSeparatorPositions", "[I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/CompilationResult", "lineSeparatorPositions", "[I");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "lineDelta", "I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "lineDelta", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/batch/Main", "showProgress", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "lineDelta", "I");
methodVisitor.visitIntInsn(SIPUSH, 2000);
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/batch/Main", "logger", "Lorg/eclipse/jdt/internal/compiler/batch/Main$Logger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/batch/Main$Logger", "logProgress", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "lineDelta", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/batch/Main", "logger", "Lorg/eclipse/jdt/internal/compiler/batch/Main$Logger;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/batch/Main$Logger", "startLoggingSource", "(Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "hasProblems", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "hasTasks", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/batch/Main", "logger", "Lorg/eclipse/jdt/internal/compiler/batch/Main$Logger;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "getAllProblems", "()[Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/CompilationResult", "compilationUnit", "Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/env/ICompilationUnit", "getContents", "()[C", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/batch/Main$Logger", "logProblems", "([Lorg/eclipse/jdt/core/compiler/CategorizedProblem;[CLorg/eclipse/jdt/internal/compiler/batch/Main;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "reportProblems", "(Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/batch/Main", "outputClassFiles", "(Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "compiler", "Lorg/eclipse/jdt/internal/compiler/batch/Main;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/batch/Main", "logger", "Lorg/eclipse/jdt/internal/compiler/batch/Main$Logger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/batch/Main$Logger", "endLoggingSource", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "reportProblems", "(Lorg/eclipse/jdt/internal/compiler/CompilationResult;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/CompilationResult", "getAllProblems", "()[Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "org/eclipse/jdt/internal/compiler/CompilationResult", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/jdt/core/compiler/CategorizedProblem;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "problemFactory", "Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/tool/EclipseDiagnostic", "newInstance", "(Lorg/eclipse/jdt/core/compiler/CategorizedProblem;Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory;)Lorg/eclipse/jdt/internal/compiler/tool/EclipseDiagnostic;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseBatchRequestor", "diagnosticListener", "Ljavax/tools/DiagnosticListener;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/tools/DiagnosticListener", "report", "(Ljavax/tools/Diagnostic;)V", true);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
