package asm.org.eclipse.persistence.internal.sequencing;
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
public class SequencingManager$Preallocation_NoTransaction_StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", null, "org/eclipse/persistence/internal/sequencing/SequencingManager$State", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "org/eclipse/persistence/internal/sequencing/SequencingManager", "Preallocation_NoTransaction_State", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sequencing/SequencingManager$State", "org/eclipse/persistence/internal/sequencing/SequencingManager", "State", ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/sequencing/SequencingManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "this$0", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sequencing/SequencingManager$State", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextValue", "(Lorg/eclipse/persistence/sequencing/Sequence;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label3, label2, label2, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sequencing/Sequence", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sequencing/Sequence", "getPreallocationSize", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "this$0", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "this$0", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sequencing/SequencingManager", "access$0", "(Lorg/eclipse/persistence/internal/sequencing/SequencingManager;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sequencing/SequencingManager", "getPreallocationHandler", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/sequencing/PreallocationHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sequencing/PreallocationHandler", "getPreallocated", "(Ljava/lang/String;)Ljava/util/Queue;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Queue", "poll", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "org/eclipse/persistence/sequencing/Sequence", "org/eclipse/persistence/internal/sessions/AbstractSession", "java/lang/String", "org/eclipse/persistence/internal/sequencing/PreallocationHandler", "java/util/Queue", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "this$0", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sequencing/SequencingManager", "acquireLock", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/helper/ConcurrencyManager;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Queue", "poll", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/ConcurrencyManager", "release", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/helper/ConcurrencyManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sequencing/Sequence", "getGeneratedVector", "(Lorg/eclipse/persistence/internal/databaseaccess/Accessor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/util/Vector;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "remove", "(I)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sequencing/PreallocationHandler", "setPreallocated", "(Ljava/lang/String;Ljava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "this$0", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sequencing/SequencingManager", "logDebugPreallocation", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Vector;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/ConcurrencyManager", "release", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/ConcurrencyManager", "release", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_NoTransaction_State", "org/eclipse/persistence/sequencing/Sequence", "org/eclipse/persistence/internal/sessions/AbstractSession", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sequencing/Sequence", "getGeneratedVector", "(Lorg/eclipse/persistence/internal/databaseaccess/Accessor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/util/Vector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "firstElement", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 11);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
