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
public class EclipseCompilerImpl$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3", null, "org/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory", null);

classWriter.visitOuterClass("org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl", "getProblemFactory", "()Lorg/eclipse/jdt/internal/compiler/IProblemFactory;");

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3$2", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$Jsr199ProblemWrapper", "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl", "Jsr199ProblemWrapper", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3", "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProblem", "([CI[Ljava/lang/String;[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3", "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl", "diagnosticListener", "Ljavax/tools/DiagnosticListener;");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3$1", "<init>", "(Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3;IIIII[Ljava/lang/String;I[C)V", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/tools/DiagnosticListener", "javax/tools/Diagnostic"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory", "createProblem", "([CI[Ljava/lang/String;[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/problem/DefaultProblem");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$Jsr199ProblemWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3", "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/problem/DefaultProblem");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$Jsr199ProblemWrapper", "<init>", "(Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblem;Ljavax/tools/Diagnostic;Ljavax/tools/DiagnosticListener;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/core/compiler/CategorizedProblem"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(11, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProblem", "([CI[Ljava/lang/String;I[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3", "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl", "diagnosticListener", "Ljavax/tools/DiagnosticListener;");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3$2", "<init>", "(Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3;IIIII[Ljava/lang/String;I[C)V", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/tools/DiagnosticListener", "javax/tools/Diagnostic"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory", "createProblem", "([CI[Ljava/lang/String;I[Ljava/lang/String;IIIII)Lorg/eclipse/jdt/core/compiler/CategorizedProblem;", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/problem/DefaultProblem");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$Jsr199ProblemWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$3", "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/problem/DefaultProblem");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl$Jsr199ProblemWrapper", "<init>", "(Lorg/eclipse/jdt/internal/compiler/tool/EclipseCompilerImpl;Lorg/eclipse/jdt/internal/compiler/problem/DefaultProblem;Ljavax/tools/Diagnostic;Ljavax/tools/DiagnosticListener;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/core/compiler/CategorizedProblem"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(11, 14);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
