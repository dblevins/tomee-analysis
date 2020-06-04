package asm.org.hsqldb.util;
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
public class DatabaseManagerSwing$11Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/util/DatabaseManagerSwing$11", null, "java/lang/Object", new String[] { "java/awt/event/ActionListener" });

classWriter.visitOuterClass("org/hsqldb/util/DatabaseManagerSwing", null, null);

classWriter.visitInnerClass("org/hsqldb/util/DatabaseManagerSwing$11", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/util/DatabaseManagerSwing$11", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "actionPerformed", "(Ljava/awt/event/ActionEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$11", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/awt/event/ActionEvent", "getActionCommand", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$1602", "(Lorg/hsqldb/util/DatabaseManagerSwing;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$11", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$1600", "(Lorg/hsqldb/util/DatabaseManagerSwing;)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$11", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$1602", "(Lorg/hsqldb/util/DatabaseManagerSwing;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$11", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/DatabaseManagerSwing", "refreshTree", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
