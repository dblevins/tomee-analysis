package asm.org.apache.taglibs.standard.lang.jstl;
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
public class PrimitiveObjectsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTE_LOWER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "BYTE_UPPER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "CHARACTER_LOWER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "CHARACTER_UPPER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "SHORT_LOWER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "SHORT_UPPER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "INTEGER_LOWER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "INTEGER_UPPER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "LONG_LOWER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "LONG_UPPER_BOUND", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "mBytes", "[Ljava/lang/Byte;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "mCharacters", "[Ljava/lang/Character;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "mShorts", "[Ljava/lang/Short;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "mIntegers", "[Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "mLongs", "[Ljava/lang/Long;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getBoolean", "(Z)Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByte", "(B)Ljava/lang/Byte;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_LOWER_BOUND", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_UPPER_BOUND", "I");
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mBytes", "[Ljava/lang/Byte;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Byte");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Byte", "<init>", "(B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCharacter", "(C)Ljava/lang/Character;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_LOWER_BOUND", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_UPPER_BOUND", "I");
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mCharacters", "[Ljava/lang/Character;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Character");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Character", "<init>", "(C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getShort", "(S)Ljava/lang/Short;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_LOWER_BOUND", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_UPPER_BOUND", "I");
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mShorts", "[Ljava/lang/Short;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Short");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Short", "<init>", "(S)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInteger", "(I)Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_LOWER_BOUND", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_UPPER_BOUND", "I");
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mIntegers", "[Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getLong", "(J)Ljava/lang/Long;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_LOWER_BOUND", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_UPPER_BOUND", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mLongs", "[Ljava/lang/Long;");
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(L2I);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Long");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Long", "<init>", "(J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getFloat", "(F)Ljava/lang/Float;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/Float");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(FLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Float", "<init>", "(F)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDouble", "(D)Ljava/lang/Double;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/Double");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(DLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Double", "<init>", "(D)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPrimitiveObjectClass", "(Ljava/lang/Class;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Byte", "TYPE", "Ljava/lang/Class;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Byte;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Short", "TYPE", "Ljava/lang/Class;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Short;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Character", "TYPE", "Ljava/lang/Class;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Character;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label5);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label6);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label7);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "createBytes", "()[Ljava/lang/Byte;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_UPPER_BOUND", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Byte");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_LOWER_BOUND", "I");
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/Byte");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Byte", "<init>", "(B)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "createCharacters", "()[Ljava/lang/Character;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_UPPER_BOUND", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Character");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_LOWER_BOUND", "I");
methodVisitor.visitInsn(I2C);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/Character");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Character", "<init>", "(C)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2C);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "createShorts", "()[Ljava/lang/Short;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_UPPER_BOUND", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Short");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_LOWER_BOUND", "I");
methodVisitor.visitInsn(I2S);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/Short");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Short", "<init>", "(S)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2S);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "createIntegers", "()[Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_UPPER_BOUND", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_LOWER_BOUND", "I");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "createLongs", "()[Ljava/lang/Long;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_UPPER_BOUND", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_LOWER_BOUND", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Long");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_LOWER_BOUND", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/Long");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Long", "<init>", "(J)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_LOWER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "BYTE_UPPER_BOUND", "I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_LOWER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "CHARACTER_UPPER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, -1000);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_LOWER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "SHORT_UPPER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, -1000);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_LOWER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "INTEGER_UPPER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, -1000);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_LOWER_BOUND", "I");
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "LONG_UPPER_BOUND", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "createBytes", "()[Ljava/lang/Byte;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mBytes", "[Ljava/lang/Byte;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "createCharacters", "()[Ljava/lang/Character;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mCharacters", "[Ljava/lang/Character;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "createShorts", "()[Ljava/lang/Short;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mShorts", "[Ljava/lang/Short;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "createIntegers", "()[Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mIntegers", "[Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "createLongs", "()[Ljava/lang/Long;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/PrimitiveObjects", "mLongs", "[Ljava/lang/Long;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
