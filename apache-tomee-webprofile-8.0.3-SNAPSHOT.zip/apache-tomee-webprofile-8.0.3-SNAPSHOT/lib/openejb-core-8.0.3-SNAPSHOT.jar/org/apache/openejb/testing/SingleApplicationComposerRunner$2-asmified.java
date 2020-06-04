package asm.org.apache.openejb.testing;
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
public class SingleApplicationComposerRunner$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/testing/SingleApplicationComposerRunner$2", null, "org/apache/openejb/testing/ApplicationComposers", null);

classWriter.visitOuterClass("org/apache/openejb/testing/SingleApplicationComposerRunner", "start", "(Ljava/lang/Class;)V");

classWriter.visitInnerClass("org/apache/openejb/testing/SingleApplicationComposerRunner$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/testing/SingleApplicationComposerRunner$2$1", null, null, 0);

{
methodVisitor = classWriter.visitMethod(ACC_VARARGS, "<init>", "(Ljava/lang/Class;[Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/testing/ApplicationComposers", "<init>", "(Ljava/lang/Class;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deployApp", "(Ljava/lang/Object;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/testing/ApplicationComposers", "deployApp", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/testing/SingleApplicationComposerRunner", "access$300", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "getThreadContext", "()Lorg/apache/openejb/core/ThreadContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/testing/SingleApplicationComposerRunner$2$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/testing/SingleApplicationComposerRunner$2$1", "<init>", "(Lorg/apache/openejb/testing/SingleApplicationComposerRunner$2;Lorg/apache/openejb/testing/ApplicationComposers;Lorg/apache/openejb/core/ThreadContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/testing/SingleApplicationComposerRunner", "access$400", "()Ljava/util/concurrent/atomic/AtomicReference;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Runtime", "getRuntime", "()Ljava/lang/Runtime;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Runtime", "addShutdownHook", "(Ljava/lang/Thread;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/testing/SingleApplicationComposerRunner", "access$302", "(Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
