package asm.org.apache.openjpa.lib.jdbc;
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
public class ConfiguringConnectionDecorator$ConfiguringConnectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", null, "org/apache/openjpa/lib/jdbc/DelegatingConnection", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "ConfiguringConnection", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_curAutoCommit", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;Ljava/sql/Connection;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "<init>", "(Ljava/sql/Connection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "_curAutoCommit", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "getAutoCommit", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "_curAutoCommit", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "_curAutoCommit", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "java/sql/Connection"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoCommit", "(Z)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$100", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "_curAutoCommit", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$100", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "commit", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "_curAutoCommit", "Z");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$100", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "rollback", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "_curAutoCommit", "Z");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$000", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareStatement", "(Ljava/lang/String;Z)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "prepareStatement", "(Ljava/lang/String;Z)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "setQueryTimeout", "(I)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/sql/PreparedStatement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareStatement", "(Ljava/lang/String;IIZ)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "prepareStatement", "(Ljava/lang/String;IIZ)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/PreparedStatement", "setQueryTimeout", "(I)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/sql/PreparedStatement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createStatement", "(Z)Ljava/sql/Statement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "createStatement", "(Z)Ljava/sql/Statement;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Statement", "setQueryTimeout", "(I)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/sql/Statement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createStatement", "(IIZ)Ljava/sql/Statement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "createStatement", "(IIZ)Ljava/sql/Statement;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator$ConfiguringConnection", "this$0", "Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator", "access$200", "(Lorg/apache/openjpa/lib/jdbc/ConfiguringConnectionDecorator;)I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Statement", "setQueryTimeout", "(I)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/sql/Statement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
