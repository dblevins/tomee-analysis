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
public class TerracottaToolkitBuilder$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER | ACC_SYNTHETIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", null, null);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$1", "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "TCConfigTypeState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$org$terracotta$quartz$TerracottaToolkitBuilder$TCConfigTypeState", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "values", "()[Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$1", "$SwitchMap$org$terracotta$quartz$TerracottaToolkitBuilder$TCConfigTypeState", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$1", "$SwitchMap$org$terracotta$quartz$TerracottaToolkitBuilder$TCConfigTypeState", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "TC_CONFIG_SNIPPET", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$1", "$SwitchMap$org$terracotta$quartz$TerracottaToolkitBuilder$TCConfigTypeState", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "TC_CONFIG_URL", "Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder$TCConfigTypeState", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
