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
public class CheckSignatureAdapter$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "Ljava/lang/Enum<Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter", "State", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EMPTY", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FORMAL", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOUND", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUPER", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARAM", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RETURN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIMPLE_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLASS_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "$VALUES", "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
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
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EMPTY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "EMPTY", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FORMAL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "FORMAL", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOUND");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "BOUND", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUPER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "SUPER", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARAM");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "PARAM", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RETURN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "RETURN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIMPLE_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "SIMPLE_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLASS_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "CLASS_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "END", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "EMPTY", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "FORMAL", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "BOUND", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "SUPER", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "PARAM", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "RETURN", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "SIMPLE_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "CLASS_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "END", "Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State", "$VALUES", "[Lorg/eclipse/persistence/internal/libraries/asm/util/CheckSignatureAdapter$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
