package asm.org.eclipse.jdt.internal.compiler.parser;
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
public class Scanner$ScanContextDetectorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", null, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardParser", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$Goal", "org/eclipse/jdt/internal/compiler/parser/Scanner", "Goal", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext", "org/eclipse/jdt/internal/compiler/parser/Scanner", "ScanContext", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "org/eclipse/jdt/internal/compiler/parser/Scanner", "ScanContextDetector", ACC_PRIVATE);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$2", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardParser", "org/eclipse/jdt/internal/compiler/parser/Scanner", "VanguardParser", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/parser/Scanner;Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "this$0", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/DefaultErrorHandlingPolicies", "ignoreAllProblems", "()Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/problem/DefaultProblemFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "<init>", "(Lorg/eclipse/jdt/internal/compiler/IErrorHandlingPolicy;Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;Lorg/eclipse/jdt/internal/compiler/IProblemFactory;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardParser", "<init>", "(Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "problemReporter", "Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "performStatementsRecovery", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "reportSyntaxErrorIsRequired", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "reportOnlyOneSyntaxError", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initializeScanner", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "complianceLevel", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "taskTags", "[[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "taskPriorities", "[[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "isTaskCaseSensitive", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "enablePreviewFeatures", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$1", "<init>", "(Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector;ZZZJJ[[C[[CZZ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "scanner", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "scanner", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner", "recordLineSeparator", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "scanner", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner", "setActiveParser", "(Lorg/eclipse/jdt/internal/compiler/parser/ConflictedParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "scanner", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "enablePreviewFeatures", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner", "previewEnabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(15, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isParsingModuleDeclaration", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScanContext", "([CI)Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "scanner", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner", "setSource", "([C)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "scanner", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner", "resetTo", "(II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "goForCompilationUnit", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$2", "<init>", "(Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector;I[II)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "parse", "(Lorg/eclipse/jdt/internal/compiler/parser/Scanner$Goal;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "scanner", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner", "scanContext", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
