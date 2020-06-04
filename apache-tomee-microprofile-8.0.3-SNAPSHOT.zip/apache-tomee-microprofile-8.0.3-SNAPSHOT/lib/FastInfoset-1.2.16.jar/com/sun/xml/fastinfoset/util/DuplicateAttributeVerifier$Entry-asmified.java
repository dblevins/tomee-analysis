package asm.com.sun.xml.fastinfoset.util;
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
public class DuplicateAttributeVerifier$EntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "Entry", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "iteration", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hashNext", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "poolNext", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$002", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "iteration", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "poolNext", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "poolNext", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "iteration", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "hashNext", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$302", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "value", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "value", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "hashNext", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
