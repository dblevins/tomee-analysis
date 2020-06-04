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
public class CharsToNameCanonicalizer$TableInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket", "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer", "Bucket", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer", "TableInfo", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "longestCollisionList", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "symbols", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "buckets", "[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(II[Ljava/lang/String;[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "longestCollisionList", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "symbols", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "buckets", "[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer", "access$000", "(Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer", "access$100", "(Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "longestCollisionList", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer", "access$200", "(Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;)[Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "symbols", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer", "access$300", "(Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;)[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "buckets", "[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createInitial", "(I)Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$TableInfo", "<init>", "(II[Ljava/lang/String;[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
