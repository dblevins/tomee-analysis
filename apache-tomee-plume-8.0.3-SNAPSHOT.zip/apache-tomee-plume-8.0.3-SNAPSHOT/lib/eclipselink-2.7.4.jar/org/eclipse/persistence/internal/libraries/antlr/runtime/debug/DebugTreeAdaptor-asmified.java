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
public class DebugTreeAdaptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/Token", "getTokenIndex", "()I", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/Token", "getType", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/Token", "getText", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "create", "(ILjava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "create", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "createNode", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "errorNode", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognitionException;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "errorNode", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/RecognitionException;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "errorNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dupTree", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "dupTree", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "simulateTreeConstruction", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "simulateTreeConstruction", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "createNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getChildCount", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getChild", "(Ljava/lang/Object;I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "simulateTreeConstruction", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "addChild", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dupNode", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "dupNode", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "createNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nil", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "nil", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "nilNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNil", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "isNil", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addChild", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "addChild", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "addChild", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "becomeRoot", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "becomeRoot", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "becomeRoot", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rulePostProcessing", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "rulePostProcessing", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addChild", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "create", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "addChild", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "becomeRoot", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "create", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "becomeRoot", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "becomeRoot", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(ILorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "create", "(ILorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "createNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(ILorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "create", "(ILorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "createNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(ILjava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "create", "(ILjava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "createNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getType", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setType", "(Ljava/lang/Object;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "setType", "(Ljava/lang/Object;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getText", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getText", "(Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setText", "(Ljava/lang/Object;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "setText", "(Ljava/lang/Object;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getToken", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getToken", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTokenBoundaries", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "setTokenBoundaries", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/Token;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/Token", "getTokenIndex", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/Token", "getTokenIndex", "()I", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "setTokenBoundaries", "(Ljava/lang/Object;II)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenStartIndex", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getTokenStartIndex", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenStopIndex", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getTokenStopIndex", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChild", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getChild", "(Ljava/lang/Object;I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setChild", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "setChild", "(Ljava/lang/Object;ILjava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deleteChild", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "deleteChild", "(Ljava/lang/Object;I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChildCount", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getChildCount", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUniqueID", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getUniqueID", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParent", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getParent", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChildIndex", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getChildIndex", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParent", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "setParent", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setChildIndex", "(Ljava/lang/Object;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "setChildIndex", "(Ljava/lang/Object;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replaceChildren", "(Ljava/lang/Object;IILjava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "replaceChildren", "(Ljava/lang/Object;IILjava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDebugListener", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTreeAdaptor", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeAdaptor", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
