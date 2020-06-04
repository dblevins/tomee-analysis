package asm.org.eclipse.persistence.internal.identitymaps;
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
public class QueueableWeakCacheKey$CacheKeyReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey$CacheKeyReference", null, "java/lang/ref/WeakReference", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey$CacheKeyReference", "org/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey", "CacheKeyReference", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "owner", "Lorg/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;Lorg/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/WeakReference", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey$CacheKeyReference", "owner", "Lorg/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOwner", "()Lorg/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey$CacheKeyReference", "owner", "Lorg/eclipse/persistence/internal/identitymaps/QueueableWeakCacheKey;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
