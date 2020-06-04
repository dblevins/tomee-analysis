package asm.org.eclipse.jdt.internal.compiler.lookup;
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
public class TypeConstants$DangerousMethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Ljava/lang/Enum<Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DangerousMethod", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Contains", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Remove", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RemoveAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ContainsAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RetainAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Get", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ContainsKey", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ContainsValue", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LastIndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Equals", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Contains");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Contains", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Remove");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Remove", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RemoveAll");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "RemoveAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ContainsAll");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RetainAll");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "RetainAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Get");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Get", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ContainsKey");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsKey", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ContainsValue");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsValue", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IndexOf");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "IndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LastIndexOf");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "LastIndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Equals");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Equals", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Contains", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Remove", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "RemoveAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "RetainAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Get", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsKey", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsValue", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "IndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "LastIndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Equals", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "detectSelector", "([C)Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(CALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitLookupSwitchInsn(label6, new int[] { 99, 101, 103, 105, 108, 114 }, new Label[] { label0, label1, label2, label3, label4, label5 });
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REMOVE", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "prefixEquals", "([C[C)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REMOVE", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Remove", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REMOVE_ALL", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "RemoveAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "RETAIN_ALL", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "RetainAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "prefixEquals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Contains", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS_ALL", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsAll", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS_KEY", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsKey", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS_VALUE", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ContainsValue", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GET", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Get", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INDEX_OF", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "IndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LAST_INDEX_OF", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "LastIndexOf", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "EQUALS", "[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([C[C)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "Equals", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
