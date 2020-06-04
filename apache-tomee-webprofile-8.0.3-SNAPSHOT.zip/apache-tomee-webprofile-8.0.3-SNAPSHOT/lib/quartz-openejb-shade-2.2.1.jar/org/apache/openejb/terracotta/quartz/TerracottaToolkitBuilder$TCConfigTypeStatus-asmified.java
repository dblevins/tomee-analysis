package asm.org.apache.openejb.terracotta.quartz;
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
public class TerracottaToolkitBuilder$TCConfigTypeStatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "TCConfigTypeState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "TCConfigTypeStatus", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$1", "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tcConfigSnippet", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tcConfigUrl", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "INIT", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "state", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "setTcConfigSnippet", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "state", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "TC_CONFIG_URL", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("TCConfig url was already set to - ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "TC_CONFIG_SNIPPET", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "state", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "tcConfigSnippet", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "setTcConfigUrl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "state", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "TC_CONFIG_SNIPPET", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("TCConfig snippet was already set to - ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "tcConfigSnippet", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "TC_CONFIG_URL", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "state", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getTcConfigSnippet", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "tcConfigSnippet", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getTcConfigUrl", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getState", "()Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "state", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeStatus", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
