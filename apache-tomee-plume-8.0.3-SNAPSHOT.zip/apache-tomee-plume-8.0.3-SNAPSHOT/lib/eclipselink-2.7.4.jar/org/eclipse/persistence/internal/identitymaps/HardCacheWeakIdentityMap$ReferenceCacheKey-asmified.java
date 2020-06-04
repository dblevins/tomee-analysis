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
public class HardCacheWeakIdentityMap$ReferenceCacheKeyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", null, "org/eclipse/persistence/internal/identitymaps/WeakCacheKey", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "ReferenceCacheKey", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/identitymaps/WeakCacheKey", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReferenceCacheNode", "()Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReferenceCacheNode", "(Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReferenceCache", "()Lorg/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "referenceCache", "Lorg/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "updateAccess", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "getContents", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "hasReference", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "buildReference", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/LinkedNode", "setContents", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "referenceCache", "Lorg/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "referenceCache", "Lorg/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "buildReference", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "addFirst", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "referenceNode", "Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "referenceCache", "Lorg/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "getReferenceCacheNode", "()Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "moveFirst", "(Lorg/eclipse/persistence/internal/helper/linkedlist/LinkedNode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "referenceCache", "Lorg/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "removeLast", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "referenceCache", "Lorg/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/linkedlist/ExposedNodeLinkedList", "size", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap$ReferenceCacheKey", "this$0", "Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap", "maxSize", "I");
methodVisitor.visitJumpInsn(IF_ICMPGT, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
