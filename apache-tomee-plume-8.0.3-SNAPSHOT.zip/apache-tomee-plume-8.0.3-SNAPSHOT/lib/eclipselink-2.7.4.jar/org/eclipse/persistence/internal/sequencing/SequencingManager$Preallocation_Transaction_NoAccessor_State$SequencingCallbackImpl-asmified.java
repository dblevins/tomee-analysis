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
public class SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/sequencing/SequencingCallback" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State", "org/eclipse/persistence/internal/sequencing/SequencingManager", "Preallocation_Transaction_NoAccessor_State", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State", "SequencingCallbackImpl", ACC_FINAL);

{
fieldVisitor = classWriter.visitField(0, "localSequences", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "context", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", "this$1", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", "localSequences", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCommit", "(Lorg/eclipse/persistence/internal/databaseaccess/Accessor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", "this$1", "Lorg/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", "context", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", "localSequences", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State", "afterCommitInternal", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/databaseaccess/Accessor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPreallocatedSequenceValues", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sequencing/SequencingManager$Preallocation_Transaction_NoAccessor_State$SequencingCallbackImpl", "localSequences", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
