package asm.org.apache.xbean.asm7;
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
public class FieldWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/apache/xbean/asm7/FieldWriter", null, "org/apache/xbean/asm7/FieldVisitor", null);

classWriter.visitInnerClass("org/apache/xbean/asm7/Attribute$Set", "org/apache/xbean/asm7/Attribute", "Set", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "accessFlags", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "nameIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "descriptorIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signatureIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "constantValueIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastRuntimeVisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastRuntimeInvisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastRuntimeVisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastRuntimeInvisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xbean/asm7/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/FieldVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "accessFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/SymbolTable", "addConstantUtf8", "(Ljava/lang/String;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "nameIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/SymbolTable", "addConstantUtf8", "(Ljava/lang/String;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "descriptorIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/SymbolTable", "addConstantUtf8", "(Ljava/lang/String;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "signatureIndex", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/SymbolTable", "addConstant", "(Ljava/lang/Object;)Lorg/apache/xbean/asm7/Symbol;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Symbol", "index", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "constantValueIndex", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/apache/xbean/asm7/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/AnnotationWriter", "create", "(Lorg/apache/xbean/asm7/SymbolTable;Ljava/lang/String;Lorg/apache/xbean/asm7/AnnotationWriter;)Lorg/apache/xbean/asm7/AnnotationWriter;", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/AnnotationWriter", "create", "(Lorg/apache/xbean/asm7/SymbolTable;Ljava/lang/String;Lorg/apache/xbean/asm7/AnnotationWriter;)Lorg/apache/xbean/asm7/AnnotationWriter;", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitTypeAnnotation", "(ILorg/apache/xbean/asm7/TypePath;Ljava/lang/String;Z)Lorg/apache/xbean/asm7/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/AnnotationWriter", "create", "(Lorg/apache/xbean/asm7/SymbolTable;ILorg/apache/xbean/asm7/TypePath;Ljava/lang/String;Lorg/apache/xbean/asm7/AnnotationWriter;)Lorg/apache/xbean/asm7/AnnotationWriter;", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/AnnotationWriter", "create", "(Lorg/apache/xbean/asm7/SymbolTable;ILorg/apache/xbean/asm7/TypePath;Ljava/lang/String;Lorg/apache/xbean/asm7/AnnotationWriter;)Lorg/apache/xbean/asm7/AnnotationWriter;", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAttribute", "(Lorg/apache/xbean/asm7/Attribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Attribute", "nextAttribute", "Lorg/apache/xbean/asm7/Attribute;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "computeFieldInfoSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "constantValueIndex", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitLdcInsn("ConstantValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/SymbolTable", "addConstantUtf8", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(1, 8);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "accessFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "signatureIndex", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Attribute", "computeAttributesSize", "(Lorg/apache/xbean/asm7/SymbolTable;II)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/AnnotationWriter", "computeAnnotationsSize", "(Lorg/apache/xbean/asm7/AnnotationWriter;Lorg/apache/xbean/asm7/AnnotationWriter;Lorg/apache/xbean/asm7/AnnotationWriter;Lorg/apache/xbean/asm7/AnnotationWriter;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Attribute", "computeAttributesSize", "(Lorg/apache/xbean/asm7/SymbolTable;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "putFieldInfo", "(Lorg/apache/xbean/asm7/ByteVector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/SymbolTable", "getMajorVersion", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 49);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitIntInsn(SIPUSH, 4096);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "accessFlags", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "nameIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "descriptorIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "constantValueIndex", "I");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "accessFlags", "I");
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitInsn(IAND);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "signatureIndex", "I");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "accessFlags", "I");
methodVisitor.visitLdcInsn(new Integer(131072));
methodVisitor.visitInsn(IAND);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Attribute", "getAttributeCount", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "constantValueIndex", "I");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitLdcInsn("ConstantValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/SymbolTable", "addConstantUtf8", "(Ljava/lang/String;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putInt", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "constantValueIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "accessFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "signatureIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Attribute", "putAttributes", "(Lorg/apache/xbean/asm7/SymbolTable;IILorg/apache/xbean/asm7/ByteVector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeVisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "lastRuntimeInvisibleTypeAnnotation", "Lorg/apache/xbean/asm7/AnnotationWriter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/AnnotationWriter", "putAnnotations", "(Lorg/apache/xbean/asm7/SymbolTable;Lorg/apache/xbean/asm7/AnnotationWriter;Lorg/apache/xbean/asm7/AnnotationWriter;Lorg/apache/xbean/asm7/AnnotationWriter;Lorg/apache/xbean/asm7/AnnotationWriter;Lorg/apache/xbean/asm7/ByteVector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "symbolTable", "Lorg/apache/xbean/asm7/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Attribute", "putAttributes", "(Lorg/apache/xbean/asm7/SymbolTable;Lorg/apache/xbean/asm7/ByteVector;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "collectAttributePrototypes", "(Lorg/apache/xbean/asm7/Attribute$Set;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/FieldWriter", "firstAttribute", "Lorg/apache/xbean/asm7/Attribute;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Attribute$Set", "addAttributes", "(Lorg/apache/xbean/asm7/Attribute;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
