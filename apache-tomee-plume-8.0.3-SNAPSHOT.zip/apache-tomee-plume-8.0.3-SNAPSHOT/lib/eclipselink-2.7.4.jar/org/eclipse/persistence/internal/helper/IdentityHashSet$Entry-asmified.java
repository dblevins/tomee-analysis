package asm.org.eclipse.persistence.internal.helper;
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
public class IdentityHashSet$EntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "org/eclipse/persistence/internal/helper/IdentityHashSet", "Entry", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "hash", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "value", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(ILjava/lang/Object;Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "value", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "clone", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "<init>", "(ILjava/lang/Object;Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "<init>", "(ILjava/lang/Object;Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityHashSet$Entry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityHashSet$Entry;");
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
