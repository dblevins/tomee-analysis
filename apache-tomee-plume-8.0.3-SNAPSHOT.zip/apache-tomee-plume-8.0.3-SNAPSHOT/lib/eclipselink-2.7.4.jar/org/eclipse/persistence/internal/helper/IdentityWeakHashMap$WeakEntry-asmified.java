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
public class IdentityWeakHashMap$WeakEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Map$Entry<TK;TV;>;", "java/lang/Object", new String[] { "java/util/Map$Entry" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "EntryReference", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$HardEntryReference", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "HardEntryReference", ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "WeakEntry", ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "WeakEntryReference", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "removed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "hash", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference<TK;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference<TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(ILjava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;Ljava/lang/ref/ReferenceQueue;)V", "(ITK;TV;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry<TK;TV;>;Ljava/lang/ref/ReferenceQueue;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "removed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", Opcodes.INTEGER, "java/lang/Object", "java/lang/Object", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "java/lang/ref/ReferenceQueue"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$HardEntryReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$HardEntryReference", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "clone", "(Ljava/lang/ref/ReferenceQueue;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "<init>", "(ILjava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;Ljava/lang/ref/ReferenceQueue;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "<init>", "(ILjava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;Ljava/lang/ref/ReferenceQueue;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "next", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKey", "()Ljava/lang/Object;", "()TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/Object;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TV;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$HardEntryReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$HardEntryReference", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Map$Entry");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "java/lang/Object"}, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "java/lang/Object"}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shouldBeIgnored", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "key", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "value", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
