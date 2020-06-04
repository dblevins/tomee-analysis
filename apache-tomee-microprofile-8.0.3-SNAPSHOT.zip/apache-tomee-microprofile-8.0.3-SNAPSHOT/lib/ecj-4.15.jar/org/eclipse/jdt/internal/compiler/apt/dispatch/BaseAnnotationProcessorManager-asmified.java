package asm.org.eclipse.jdt.internal.compiler.apt.dispatch;
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
public class BaseAnnotationProcessorManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", null, "org/eclipse/jdt/internal/compiler/AbstractAnnotationProcessorManager", new String[] { "org/eclipse/jdt/internal/compiler/apt/dispatch/IProcessorProvider" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_out", "Ljava/io/PrintWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_err", "Ljava/io/PrintWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_processingEnv", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "_isFirstRound", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_processors", "Ljava/util/List;", "Ljava/util/List<Lorg/eclipse/jdt/internal/compiler/apt/dispatch/ProcessorInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_printProcessorInfo", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_printRounds", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_round", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/AbstractAnnotationProcessorManager", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_isFirstRound", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processors", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_printProcessorInfo", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_printRounds", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Ljava/lang/Object;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configureFromPlatform", "(Lorg/eclipse/jdt/internal/compiler/Compiler;Ljava/lang/Object;Ljava/lang/Object;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDiscoveredProcessors", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/jdt/internal/compiler/apt/dispatch/ProcessorInfo;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processors", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeletedUnits", "()[Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processingEnv", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "getDeletedUnits", "()[Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNewUnits", "()[Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processingEnv", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "getNewUnits", "()[Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNewClassFiles", "()[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processingEnv", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "getNewClassFiles", "()[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processingEnv", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setErr", "(Ljava/io/PrintWriter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_err", "Ljava/io/PrintWriter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOut", "(Ljava/io/PrintWriter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_out", "Ljava/io/PrintWriter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProcessors", "([Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processAnnotations", "([Lorg/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration;[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "[Lorg/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration;", "[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration", "scope", "Lorg/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration", "scope", "Lorg/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope", "module", "()Lorg/eclipse/jdt/internal/compiler/lookup/ModuleBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processingEnv", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_current_module", "Lorg/eclipse/jdt/internal/compiler/lookup/ModuleBinding;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "[Lorg/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration;", "[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/dispatch/RoundEnvImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_processingEnv", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/RoundEnvImpl", "<init>", "([Lorg/eclipse/jdt/internal/compiler/ast/CompilationUnitDeclaration;[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;ZLorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_printProcessorInfo", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_out", "Ljava/io/PrintWriter;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/internal/compiler/apt/dispatch/RoundEnvImpl"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/PrintWriter"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_printRounds", "Z");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_out", "Ljava/io/PrintWriter;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/PrintWriter"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/PrintWriter"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Round ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_round", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_round", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintWriter", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/PrintWriter"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/dispatch/RoundDispatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/RoundEnvImpl", "getRootAnnotations", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/RoundDispatcher", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/IProcessorProvider;Ljavax/annotation/processing/RoundEnvironment;Ljava/util/Set;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/RoundDispatcher", "round", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_isFirstRound", "Z");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseAnnotationProcessorManager", "_isFirstRound", "Z");
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/internal/compiler/apt/dispatch/RoundDispatcher"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
