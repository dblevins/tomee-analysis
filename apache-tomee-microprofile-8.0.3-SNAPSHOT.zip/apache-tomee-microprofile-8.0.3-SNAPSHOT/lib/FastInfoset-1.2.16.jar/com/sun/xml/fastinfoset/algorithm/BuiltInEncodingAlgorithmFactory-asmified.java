package asm.com.sun.xml.fastinfoset.algorithm;
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
public class BuiltInEncodingAlgorithmFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "hexadecimalEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/HexadecimalEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "base64EncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/BASE64EncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "booleanEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/BooleanEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "shortEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/ShortEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "intEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/IntEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "longEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/LongEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "floatEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/FloatEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "doubleEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/DoubleEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "uuidEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAlgorithm", "(I)Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/HexadecimalEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/HexadecimalEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "hexadecimalEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/HexadecimalEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/BASE64EncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/BASE64EncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "base64EncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/BASE64EncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/BooleanEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/BooleanEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "booleanEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/BooleanEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/ShortEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/ShortEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "shortEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/ShortEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/IntEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/IntEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "intEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/IntEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/LongEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/LongEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "longEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/LongEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/FloatEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/FloatEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "floatEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/FloatEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/DoubleEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/DoubleEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "doubleEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/DoubleEncodingAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "uuidEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "hexadecimalEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/HexadecimalEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "base64EncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/BASE64EncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "shortEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/ShortEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "intEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/IntEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "longEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/LongEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "booleanEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/BooleanEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "floatEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/FloatEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "doubleEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/DoubleEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "table", "[Lcom/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithmFactory", "uuidEncodingAlgorithm", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
