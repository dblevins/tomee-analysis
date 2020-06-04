package asm.org.apache.openejb.resource.jdbc.router;
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
public class FailOverRouter$5Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/jdbc/router/FailOverRouter$5", null, "java/lang/Object", new String[] { "org/apache/openejb/resource/jdbc/router/FailOverRouter$Strategy" });

classWriter.visitOuterClass("org/apache/openejb/resource/jdbc/router/FailOverRouter", "initStrategy", "()V");

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/router/FailOverRouter$5", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder", "org/apache/openejb/resource/jdbc/router/FailOverRouter", "DataSourceHolder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/router/FailOverRouter$Strategy", "org/apache/openejb/resource/jdbc/router/FailOverRouter", "Strategy", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/router/FailOverRouter$5", "this$0", "Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepare", "(Ljava/util/Collection;)Ljava/util/Collection;", "(Ljava/util/Collection<Lorg/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder;>;)Ljava/util/Collection<Lorg/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "used", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/router/FailOverRouter$5", "this$0", "Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/router/FailOverRouter", "access$100", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;)Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label6);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/router/FailOverRouter$5", "this$0", "Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/router/FailOverRouter", "access$100", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;)Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/router/FailOverRouter$5", "this$0", "Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/router/FailOverRouter", "access$100", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;)Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/resource/jdbc/router/FailOverRouter$DataSourceHolder");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/router/FailOverRouter$5", "this$0", "Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/router/FailOverRouter", "access$100", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/router/FailOverRouter$5", "this$0", "Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/router/FailOverRouter", "access$100", "(Lorg/apache/openejb/resource/jdbc/router/FailOverRouter;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "lastIndexOf", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
