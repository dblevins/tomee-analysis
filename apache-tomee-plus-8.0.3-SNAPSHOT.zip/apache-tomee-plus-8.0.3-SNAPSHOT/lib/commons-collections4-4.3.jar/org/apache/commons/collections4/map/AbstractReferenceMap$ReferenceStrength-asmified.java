package asm.org.apache.commons.collections4.map;
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
public class AbstractReferenceMap$ReferenceStrengthDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "Ljava/lang/Enum<Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "org/apache/commons/collections4/map/AbstractReferenceMap", "ReferenceStrength", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HARD", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SOFT", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WEAK", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "value", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "$VALUES", "[Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "resolve", "(I)Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(0, 2, label3, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "HARD", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "SOFT", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "WEAK", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "value", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HARD");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "HARD", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SOFT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "SOFT", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WEAK");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "WEAK", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "HARD", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "SOFT", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "WEAK", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "$VALUES", "[Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
