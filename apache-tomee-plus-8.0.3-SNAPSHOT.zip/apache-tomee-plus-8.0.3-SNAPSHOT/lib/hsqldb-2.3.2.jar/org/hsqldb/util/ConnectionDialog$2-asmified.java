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
public class ConnectionDialog$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/util/ConnectionDialog$2", null, "java/lang/Object", new String[] { "java/awt/event/ActionListener" });

classWriter.visitOuterClass("org/hsqldb/util/ConnectionDialog", "create", "()V");

classWriter.visitInnerClass("org/hsqldb/util/ConnectionDialog$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/hsqldb/util/ConnectionDialog;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/hsqldb/util/ConnectionDialog;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/util/ConnectionDialog$2", "this$0", "Lorg/hsqldb/util/ConnectionDialog;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "actionPerformed", "(Ljava/awt/event/ActionEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/ConnectionDialogCommon", "deleteRecentConnectionSettings", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/ConnectionDialog$2", "this$0", "Lorg/hsqldb/util/ConnectionDialog;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/ConnectionDialog", "access$002", "(Lorg/hsqldb/util/ConnectionDialog;Ljava/util/Hashtable;)Ljava/util/Hashtable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/ConnectionDialog$2", "this$0", "Lorg/hsqldb/util/ConnectionDialog;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/ConnectionDialog", "access$100", "(Lorg/hsqldb/util/ConnectionDialog;)Ljava/awt/Choice;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/awt/Choice", "removeAll", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/ConnectionDialog$2", "this$0", "Lorg/hsqldb/util/ConnectionDialog;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/ConnectionDialog", "access$100", "(Lorg/hsqldb/util/ConnectionDialog;)Ljava/awt/Choice;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/util/ConnectionDialogCommon", "emptySettingName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/awt/Choice", "add", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/ConnectionDialog$2", "this$0", "Lorg/hsqldb/util/ConnectionDialog;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/ConnectionDialog", "mName", "Ljava/awt/TextField;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/awt/TextField", "setText", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
