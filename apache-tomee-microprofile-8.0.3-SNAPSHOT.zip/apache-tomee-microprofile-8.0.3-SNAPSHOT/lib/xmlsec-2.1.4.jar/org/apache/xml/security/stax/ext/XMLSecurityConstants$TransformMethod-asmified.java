package asm.org.apache.xml.security.stax.ext;
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
public class XMLSecurityConstants$TransformMethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "Ljava/lang/Enum<Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "TransformMethod", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLSecEvent", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "InputStream", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "$VALUES", "[Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLSecEvent");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "XMLSecEvent", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("InputStream");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "InputStream", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "XMLSecEvent", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "InputStream", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod", "$VALUES", "[Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$TransformMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
