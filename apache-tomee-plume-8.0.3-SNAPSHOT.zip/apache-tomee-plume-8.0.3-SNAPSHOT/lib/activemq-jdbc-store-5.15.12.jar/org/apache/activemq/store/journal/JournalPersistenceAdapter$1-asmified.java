package asm.org.apache.activemq.store.journal;
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
public class JournalPersistenceAdapter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/journal/JournalPersistenceAdapter$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/store/journal/JournalPersistenceAdapter", "createPeriodicCheckpointTask", "()Ljava/lang/Runnable;");

classWriter.visitInnerClass("org/apache/activemq/store/journal/JournalPersistenceAdapter$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/journal/JournalPersistenceAdapter$1", "this$0", "Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/journal/JournalPersistenceAdapter$1", "this$0", "Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/journal/JournalPersistenceAdapter", "access$000", "(Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;)J", false);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/activemq/store/journal/JournalPersistenceAdapter$1", Opcodes.LONG, "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/journal/JournalPersistenceAdapter$1", "this$0", "Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/journal/JournalPersistenceAdapter", "access$100", "(Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;)J", false);
methodVisitor.visitInsn(LADD);
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFLE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/journal/JournalPersistenceAdapter$1", "this$0", "Lorg/apache/activemq/store/journal/JournalPersistenceAdapter;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/journal/JournalPersistenceAdapter", "checkpoint", "(ZZ)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
