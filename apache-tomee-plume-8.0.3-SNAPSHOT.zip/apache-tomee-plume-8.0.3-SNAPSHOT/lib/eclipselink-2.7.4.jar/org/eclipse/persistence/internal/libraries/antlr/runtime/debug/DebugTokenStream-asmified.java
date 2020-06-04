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
public class DebugTokenStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "initialStreamState", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "lastMarker", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "initialStreamState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "LT", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "consume", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "initialStreamState", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "consumeInitialHiddenTokens", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "index", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "LT", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "consume", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "index", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "consumeToken", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", true);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", Opcodes.INTEGER, "org/eclipse/persistence/internal/libraries/antlr/runtime/Token", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "get", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "consumeHiddenToken", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", true);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "consumeInitialHiddenTokens", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "index", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "get", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "consumeHiddenToken", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", true);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "initialStreamState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "LT", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "initialStreamState", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "consumeInitialHiddenTokens", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "LT", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "LT", "(ILorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "LT", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "LA", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "initialStreamState", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "consumeInitialHiddenTokens", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "LT", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "LT", "(ILorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "LA", "(I)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "get", "(I)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mark", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "mark", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "lastMarker", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "lastMarker", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "mark", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "lastMarker", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "index", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "index", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "range", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "range", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rewind", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "rewind", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "rewind", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rewind", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "rewind", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "lastMarker", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "rewind", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "seek", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "seek", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenSource", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenSource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "getTokenSource", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenSource;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSourceName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "getTokenSource", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenSource;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenSource", "getSourceName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(II)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "toString", "(II)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTokenStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "toString", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
