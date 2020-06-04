package asm.org.apache.openejb.core.stateless;
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
public class StatelessContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/stateless/StatelessContext", null, "org/apache/openejb/core/BaseSessionContext", new String[] { "java/io/Flushable" });

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessContext$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/core/BaseContext$Call", "org/apache/openejb/core/BaseContext", "Call", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "flushable", "Ljava/io/Flushable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/spi/SecurityService;Ljava/io/Flushable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseSessionContext", "<init>", "(Lorg/apache/openejb/spi/SecurityService;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessContext", "flushable", "Ljava/io/Flushable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "check", "(Lorg/apache/openejb/core/ThreadContext;Lorg/apache/openejb/core/BaseContext$Call;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ThreadContext", "getCurrentOperation", "()Lorg/apache/openejb/core/Operation;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/stateless/StatelessContext$1", "$SwitchMap$org$apache$openejb$core$BaseContext$Call", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/BaseContext$Call", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(1, 14, label4, new Label[] { label0, label0, label0, label0, label0, label0, label1, label1, label1, label1, label1, label1, label2, label3 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/Operation"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/stateless/StatelessContext$1", "$SwitchMap$org$apache$openejb$core$Operation", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/Operation", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitLookupSwitchInsn(label6, new int[] { 1 }, new Label[] { label5 });
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/stateless/StatelessContext", "illegal", "(Lorg/apache/openejb/core/BaseContext$Call;Lorg/apache/openejb/core/Operation;)Ljava/lang/IllegalStateException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/stateless/StatelessContext$1", "$SwitchMap$org$apache$openejb$core$Operation", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/Operation", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTableSwitchInsn(1, 4, label8, new Label[] { label7, label7, label7, label7 });
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/stateless/StatelessContext", "illegal", "(Lorg/apache/openejb/core/BaseContext$Call;Lorg/apache/openejb/core/Operation;)Ljava/lang/IllegalStateException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/stateless/StatelessContext$1", "$SwitchMap$org$apache$openejb$core$Operation", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/Operation", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label9 = new Label();
Label label10 = new Label();
methodVisitor.visitLookupSwitchInsn(label10, new int[] { 5 }, new Label[] { label9 });
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/stateless/StatelessContext", "illegal", "(Lorg/apache/openejb/core/BaseContext$Call;Lorg/apache/openejb/core/Operation;)Ljava/lang/IllegalStateException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/stateless/StatelessContext$1", "$SwitchMap$org$apache$openejb$core$Operation", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/Operation", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitLookupSwitchInsn(label12, new int[] { 6 }, new Label[] { label11 });
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/stateless/StatelessContext", "illegal", "(Lorg/apache/openejb/core/BaseContext$Call;Lorg/apache/openejb/core/Operation;)Ljava/lang/IllegalStateException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessContext", "flushable", "Ljava/io/Flushable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/Flushable", "flush", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
