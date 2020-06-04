package asm.com.fasterxml.jackson.core.sym;
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
public class ByteQuadsCanonicalizer$TableInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "TableInfo", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "count", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "tertiaryShift", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "mainHash", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "names", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "spilloverEnd", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "longNameOffset", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(III[I[Ljava/lang/String;II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "count", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "tertiaryShift", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "mainHash", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "names", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "spilloverEnd", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "longNameOffset", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "access$000", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "access$100", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "count", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "access$200", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "tertiaryShift", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "access$300", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)[I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "mainHash", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "access$400", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)[Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "names", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "access$500", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "spilloverEnd", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "access$600", "(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "longNameOffset", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createInitial", "(I)Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer", "_calcTertiaryShift", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo", "<init>", "(III[I[Ljava/lang/String;II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
