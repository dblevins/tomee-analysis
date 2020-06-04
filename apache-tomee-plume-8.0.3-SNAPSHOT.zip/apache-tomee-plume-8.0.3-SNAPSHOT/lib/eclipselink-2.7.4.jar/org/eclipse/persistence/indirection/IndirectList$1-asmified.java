package asm.org.eclipse.persistence.indirection;
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
public class IndirectList$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/indirection/IndirectList$1", "Ljava/lang/Object;Ljava/util/ListIterator<TE;>;", "java/lang/Object", new String[] { "java/util/ListIterator" });

classWriter.visitOuterClass("org/eclipse/persistence/indirection/IndirectList", "listIterator", "(I)Ljava/util/ListIterator;");

classWriter.visitInnerClass("org/eclipse/persistence/indirection/IndirectList$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(0, "delegateIterator", "Ljava/util/ListIterator;", "Ljava/util/ListIterator<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentObject", "Ljava/lang/Object;", "TE;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/indirection/IndirectList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/indirection/IndirectList;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "this$0", "Lorg/eclipse/persistence/indirection/IndirectList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/indirection/IndirectList", "getDelegate", "()Ljava/util/Vector;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "listIterator", "(I)Ljava/util/ListIterator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "hasPrevious", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previousIndex", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "nextIndex", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previous", "()Ljava/lang/Object;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "remove", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "this$0", "Lorg/eclipse/persistence/indirection/IndirectList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "nextIndex", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/indirection/IndirectList", "raiseRemoveChangeEvent", "(Ljava/lang/Object;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Ljava/lang/Object;)V", "(TE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "set", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previousIndex", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "this$0", "Lorg/eclipse/persistence/indirection/IndirectList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/indirection/IndirectList", "raiseRemoveChangeEvent", "(Ljava/lang/Object;Ljava/lang/Integer;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "this$0", "Lorg/eclipse/persistence/indirection/IndirectList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/indirection/IndirectList", "raiseAddChangeEvent", "(Ljava/lang/Object;Ljava/lang/Integer;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/Object;)V", "(TE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "add", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "this$0", "Lorg/eclipse/persistence/indirection/IndirectList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "previousIndex", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/indirection/IndirectList", "raiseAddChangeEvent", "(Ljava/lang/Object;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forEachRemaining", "(Ljava/util/function/Consumer;)V", "(Ljava/util/function/Consumer<-TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/indirection/IndirectList$1", "delegateIterator", "Ljava/util/ListIterator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/ListIterator", "forEachRemaining", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
