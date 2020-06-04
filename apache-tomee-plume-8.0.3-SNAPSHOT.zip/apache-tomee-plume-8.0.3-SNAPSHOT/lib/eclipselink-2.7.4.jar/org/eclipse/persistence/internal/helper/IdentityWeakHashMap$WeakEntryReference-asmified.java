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
public class IdentityWeakHashMap$WeakEntryReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference", "<T:Ljava/lang/Object;>Ljava/lang/ref/WeakReference<TT;>;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference;", "java/lang/ref/WeakReference", new String[] { "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$EntryReference", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "EntryReference", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "WeakEntry", ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "WeakEntryReference", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "owner", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "trashed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;)V", "(TT;Ljava/lang/ref/ReferenceQueue<-TT;>;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/WeakReference", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference", "trashed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference", "owner", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$WeakEntryReference", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
