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
public class SingleApplicationComposerRunner$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", null, "org/junit/runners/model/Statement", null);

classWriter.visitOuterClass("org/apache/openejb/testing/SingleApplicationComposerRunner$1", "apply", "(Lorg/junit/runners/model/Statement;Lorg/junit/runners/model/FrameworkMethod;Ljava/lang/Object;)Lorg/junit/runners/model/Statement;");

classWriter.visitInnerClass("org/apache/openejb/testing/SingleApplicationComposerRunner$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$target", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$base", "Lorg/junit/runners/model/Statement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/openejb/testing/SingleApplicationComposerRunner$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/testing/SingleApplicationComposerRunner$1;Ljava/lang/Object;Lorg/junit/runners/model/Statement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", "this$1", "Lorg/apache/openejb/testing/SingleApplicationComposerRunner$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", "val$target", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", "val$base", "Lorg/junit/runners/model/Statement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/junit/runners/model/Statement", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "()V", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", "this$1", "Lorg/apache/openejb/testing/SingleApplicationComposerRunner$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/testing/SingleApplicationComposerRunner$1", "this$0", "Lorg/apache/openejb/testing/SingleApplicationComposerRunner;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/testing/SingleApplicationComposerRunner", "getTestClass", "()Lorg/junit/runners/model/TestClass;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/junit/runners/model/TestClass", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/testing/SingleApplicationComposerRunner", "access$100", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", "val$target", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/testing/SingleApplicationComposerRunner", "access$200", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/testing/SingleApplicationComposerRunner$1$1", "val$base", "Lorg/junit/runners/model/Statement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/junit/runners/model/Statement", "evaluate", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
