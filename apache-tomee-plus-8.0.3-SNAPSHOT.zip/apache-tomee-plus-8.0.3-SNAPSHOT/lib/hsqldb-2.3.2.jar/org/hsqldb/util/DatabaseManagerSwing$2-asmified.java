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
public class DatabaseManagerSwing$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/util/DatabaseManagerSwing$2", null, "java/lang/Object", new String[] { "java/awt/event/ActionListener" });

classWriter.visitOuterClass("org/hsqldb/util/DatabaseManagerSwing", "main", "()V");

classWriter.visitInnerClass("org/hsqldb/util/DatabaseManagerSwing$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/util/DatabaseManagerSwing$2", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$2", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing", "fMain", "Ljavax/swing/RootPaneContainer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/swing/RootPaneContainer", "getContentPane", "()Ljava/awt/Container;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$100", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("HELP");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/swing/JOptionPane", "showMessageDialog", "(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
