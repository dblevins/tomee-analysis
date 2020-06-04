package asm.org.apache.openjpa.ee;
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
public class WASManagedRuntime$WASSynchronizationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", null, "java/lang/Object", new String[] { "com/ibm/websphere/jtaextensions/SynchronizationCallback" });

classWriter.visitInnerClass("org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "org/apache/openjpa/ee/WASManagedRuntime", "WASSynchronization", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "_sync", "Ljavax/transaction/Synchronization;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/transaction/Synchronization;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "_sync", "Ljavax/transaction/Synchronization;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "_sync", "Ljavax/transaction/Synchronization;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCompletion", "(I[BZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "_sync", "Ljavax/transaction/Synchronization;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "_sync", "Ljavax/transaction/Synchronization;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/transaction/Synchronization", "afterCompletion", "(I)V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "_sync", "Ljavax/transaction/Synchronization;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/transaction/Synchronization", "afterCompletion", "(I)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeCompletion", "(I[B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "_sync", "Ljavax/transaction/Synchronization;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "_sync", "Ljavax/transaction/Synchronization;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/transaction/Synchronization", "beforeCompletion", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
