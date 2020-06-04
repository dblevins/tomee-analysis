package asm.org.eclipse.persistence.internal.libraries.asm.util;
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
public class CheckMethodAdapter$MethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "Ljava/lang/Enum<Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter", "Method", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VISIT_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VISIT_INT_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VISIT_VAR_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VISIT_TYPE_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VISIT_FIELD_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VISIT_METHOD_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VISIT_JUMP_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "$VALUES", "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VISIT_INSN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VISIT_INT_INSN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_INT_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VISIT_VAR_INSN");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_VAR_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VISIT_TYPE_INSN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_TYPE_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VISIT_FIELD_INSN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_FIELD_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VISIT_METHOD_INSN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_METHOD_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VISIT_JUMP_INSN");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_JUMP_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_INT_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_VAR_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_TYPE_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_FIELD_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_METHOD_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "VISIT_JUMP_INSN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method", "$VALUES", "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckMethodAdapter$Method;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
