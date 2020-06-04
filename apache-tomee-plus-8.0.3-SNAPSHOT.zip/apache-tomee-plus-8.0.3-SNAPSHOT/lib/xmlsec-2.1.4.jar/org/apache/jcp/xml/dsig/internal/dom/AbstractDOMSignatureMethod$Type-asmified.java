package asm.org.apache.jcp.xml.dsig.internal.dom;
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
public class AbstractDOMSignatureMethod$TypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "Ljava/lang/Enum<Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod", "Type", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ECDSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HMAC", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "$VALUES", "[Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DSA");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "DSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "RSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ECDSA");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "ECDSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HMAC");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "HMAC", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "DSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "RSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "ECDSA", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "HMAC", "Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type", "$VALUES", "[Lorg/apache/jcp/xml/dsig/internal/dom/AbstractDOMSignatureMethod$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
