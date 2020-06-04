package asm.org.codehaus.stax2.typed;
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
public class Base64VariantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/codehaus/stax2/typed/Base64Variants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "STD_BASE64_ALPHABET", "Ljava/lang/String;", null, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIME", "Lorg/codehaus/stax2/typed/Base64Variant;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIME_NO_LINEFEEDS", "Lorg/codehaus/stax2/typed/Base64Variant;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PEM", "Lorg/codehaus/stax2/typed/Base64Variant;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODIFIED_FOR_URL", "Lorg/codehaus/stax2/typed/Base64Variant;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultVariant", "()Lorg/codehaus/stax2/typed/Base64Variant;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/codehaus/stax2/typed/Base64Variants", "MIME", "Lorg/codehaus/stax2/typed/Base64Variant;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/typed/Base64Variant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MIME");
methodVisitor.visitLdcInsn("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/typed/Base64Variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZCI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/codehaus/stax2/typed/Base64Variants", "MIME", "Lorg/codehaus/stax2/typed/Base64Variant;");
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/typed/Base64Variant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/codehaus/stax2/typed/Base64Variants", "MIME", "Lorg/codehaus/stax2/typed/Base64Variant;");
methodVisitor.visitLdcInsn("MIME-NO-LINEFEEDS");
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/typed/Base64Variant", "<init>", "(Lorg/codehaus/stax2/typed/Base64Variant;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/codehaus/stax2/typed/Base64Variants", "MIME_NO_LINEFEEDS", "Lorg/codehaus/stax2/typed/Base64Variant;");
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/typed/Base64Variant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/codehaus/stax2/typed/Base64Variants", "MIME", "Lorg/codehaus/stax2/typed/Base64Variant;");
methodVisitor.visitLdcInsn("PEM");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/typed/Base64Variant", "<init>", "(Lorg/codehaus/stax2/typed/Base64Variant;Ljava/lang/String;ZCI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/codehaus/stax2/typed/Base64Variants", "PEM", "Lorg/codehaus/stax2/typed/Base64Variant;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("+");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "setCharAt", "(IC)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "setCharAt", "(IC)V", false);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/typed/Base64Variant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MODIFIED-FOR-URL");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/typed/Base64Variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZCI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/codehaus/stax2/typed/Base64Variants", "MODIFIED_FOR_URL", "Lorg/codehaus/stax2/typed/Base64Variant;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
