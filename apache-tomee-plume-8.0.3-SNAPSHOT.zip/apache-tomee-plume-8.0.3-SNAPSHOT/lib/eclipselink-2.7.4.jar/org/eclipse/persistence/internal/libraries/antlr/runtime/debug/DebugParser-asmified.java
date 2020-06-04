package asm.org.eclipse.persistence.internal.libraries.antlr.runtime.debug;
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
public class DebugParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", null, "org/eclipse/persistence/internal/libraries/antlr/runtime/Parser", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "isCyclicDecision", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognizerSharedState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.UNINITIALIZED_THIS});
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.UNINITIALIZED_THIS, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "org/eclipse/persistence/internal/libraries/antlr/runtime/RecognizerSharedState"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/Parser", "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognizerSharedState;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "isCyclicDecision", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognizerSharedState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.UNINITIALIZED_THIS});
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "org/eclipse/persistence/internal/libraries/antlr/runtime/RecognizerSharedState"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/Parser", "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognizerSharedState;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "isCyclicDecision", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.UNINITIALIZED_THIS});
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognizerSharedState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDebugListener", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reportError", "(Ljava/io/IOException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "printStackTrace", "(Ljava/io/PrintStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginResync", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "beginResync", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endResync", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "endResync", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginBacktrack", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "beginBacktrack", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endBacktrack", "(IZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "endBacktrack", "(IZ)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reportError", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognitionException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/Parser", "reportError", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognitionException;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugParser", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "recognitionException", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognitionException;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
