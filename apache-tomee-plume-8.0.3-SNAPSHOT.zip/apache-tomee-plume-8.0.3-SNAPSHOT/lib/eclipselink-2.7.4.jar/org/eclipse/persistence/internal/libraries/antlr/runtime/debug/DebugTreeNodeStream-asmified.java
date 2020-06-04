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
public class DebugTreeNodeStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "initialStreamState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "getTreeAdaptor", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "setUniqueNavigationNodes", "(Z)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDebugListener", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTreeAdaptor", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "consume", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "LT", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "consume", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "consumeNode", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "LT", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "LT", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getUniqueID", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getText", "(Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getType", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "LT", "(ILjava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "LA", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "LT", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getUniqueID", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getText", "(Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "adaptor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeAdaptor", "getType", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "LT", "(ILjava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mark", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "mark", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "lastMarker", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "lastMarker", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "mark", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "lastMarker", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "index", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "index", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rewind", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "rewind", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "rewind", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rewind", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "dbg", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugEventListener", "rewind", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "lastMarker", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "rewind", "(I)V", true);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "seek", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTreeSource", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSourceName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "getTokenStream", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream", "getSourceName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenStream", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "getTokenStream", "()Lorg/eclipse/persistence/internal/libraries/antlr/runtime/TokenStream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUniqueNavigationNodes", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "setUniqueNavigationNodes", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replaceChildren", "(Ljava/lang/Object;IILjava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "replaceChildren", "(Ljava/lang/Object;IILjava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/debug/DebugTreeNodeStream", "input", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeNodeStream", "toString", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
