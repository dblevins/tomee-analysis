package asm.org.apache.openjpa.kernel;
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
public class PCStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/kernel/PCState", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNEW", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PCLEAN", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PDIRTY", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PDELETED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNEWDELETED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNEWPROVISIONAL", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNONTRANS", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNONTRANSDIRTY", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNONTRANSNEW", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNONTRANSDELETED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HOLLOW", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSIENT", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TCLEAN", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TDIRTY", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLOADED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECOPY", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLEAN", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EDIRTY", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EDELETED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENONTRANS", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNEWFLUSHEDDELETED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PNEWFLUSHEDDELETEDFLUSHED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PDELETEDFLUSHED", "Lorg/apache/openjpa/kernel/PCState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "_loc", "Lorg/apache/openjpa/lib/util/Localizer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "initialize", "(Lorg/apache/openjpa/kernel/StateManagerImpl;Lorg/apache/openjpa/kernel/PCState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeFlush", "(Lorg/apache/openjpa/kernel/StateManagerImpl;ZLorg/apache/openjpa/kernel/OpCallbacks;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "flush", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "commit", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "commitRetain", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "rollback", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "rollbackRestore", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "persist", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "delete", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "nonprovisional", "(Lorg/apache/openjpa/kernel/StateManagerImpl;ZLorg/apache/openjpa/kernel/OpCallbacks;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "nontransactional", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "transactional", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "release", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "evict", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "afterRefresh", "()Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "afterOptimisticRefresh", "()Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "afterNontransactionalRefresh", "()Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeRead", "(Lorg/apache/openjpa/kernel/StateManagerImpl;I)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeNontransactionalRead", "(Lorg/apache/openjpa/kernel/StateManagerImpl;I)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeOptimisticRead", "(Lorg/apache/openjpa/kernel/StateManagerImpl;I)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeWrite", "(Lorg/apache/openjpa/kernel/StateManagerImpl;IZ)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeOptimisticWrite", "(Lorg/apache/openjpa/kernel/StateManagerImpl;IZ)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeNontransactionalWrite", "(Lorg/apache/openjpa/kernel/StateManagerImpl;IZ)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isTransactional", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isPersistent", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isNew", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isDeleted", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isDirty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isPendingTransactional", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isProvisional", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isVersionCheckRequired", "(Lorg/apache/openjpa/kernel/StateManagerImpl;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "error", "(Ljava/lang/String;Lorg/apache/openjpa/kernel/StateManagerImpl;)Lorg/apache/openjpa/kernel/PCState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/StateManagerImpl", "getManagedInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/util/InvalidStateException", "setFailedObject", "(Ljava/lang/Object;)Lorg/apache/openjpa/util/OpenJPAException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "readResolve", "()Ljava/lang/Object;", null, new String[] { "java/io/ObjectStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNewState");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNEW", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PCleanState");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PCLEAN", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PDirtyState");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PDeletedState");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNewDeletedState");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNewProvisionalState");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWPROVISIONAL", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNonTransState");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANS", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNonTransDirtyState");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANSDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNonTransNewState");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANSNEW", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNonTransDeletedState");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANSDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/HollowState");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "HOLLOW", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/TransientState");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "TRANSIENT", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/TCleanState");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "TCLEAN", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/TDirtyState");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "TDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/ECopyState");
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "ECOPY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/ECleanState");
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "ECLEAN", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/EDirtyState");
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "EDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/EDeletedState");
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "EDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/ENonTransState");
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "ENONTRANS", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNewFlushedDeletedState");
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWFLUSHEDDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PNewFlushedDeletedFlushedState");
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWFLUSHEDDELETEDFLUSHED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/PDeletedFlushedState");
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/PCState", "PDELETEDFLUSHED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InternalException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InternalException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNewState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNewState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNEW", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PCleanState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PCleanState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PCLEAN", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PDirtyState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PDirtyState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PDeletedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PDeletedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNewDeletedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNewDeletedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNewProvisionalState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNewProvisionalState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWPROVISIONAL", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNonTransState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNonTransState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANS", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNonTransDirtyState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNonTransDirtyState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANSDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNonTransNewState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNonTransNewState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANSNEW", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNonTransDeletedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNonTransDeletedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNONTRANSDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/HollowState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/HollowState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "HOLLOW", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/TransientState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/TransientState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "TRANSIENT", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/TCleanState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/TCleanState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "TCLEAN", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/TDirtyState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/TDirtyState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "TDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/TLoadedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/TLoadedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "TLOADED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/ECopyState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/ECopyState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "ECOPY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/ECleanState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/ECleanState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "ECLEAN", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/EDirtyState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/EDirtyState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "EDIRTY", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/EDeletedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/EDeletedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "EDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/ENonTransState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/ENonTransState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "ENONTRANS", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNewFlushedDeletedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNewFlushedDeletedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWFLUSHEDDELETED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PNewFlushedDeletedFlushedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PNewFlushedDeletedFlushedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PNEWFLUSHEDDELETEDFLUSHED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/kernel/PDeletedFlushedState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/PDeletedFlushedState", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "PDELETEDFLUSHED", "Lorg/apache/openjpa/kernel/PCState;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/PCState;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/PCState", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
