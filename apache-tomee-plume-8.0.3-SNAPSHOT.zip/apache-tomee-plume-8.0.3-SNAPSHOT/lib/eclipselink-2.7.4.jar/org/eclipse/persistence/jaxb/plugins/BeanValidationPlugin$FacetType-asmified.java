package asm.org.eclipse.persistence.jaxb.plugins;
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
public class BeanValidationPlugin$FacetTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "Ljava/lang/Enum<Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "FacetType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "maxExclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "minExclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "maxInclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "minInclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "nillable", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "pattern", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "length", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "maxLength", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "minLength", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "minOccurs", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "maxOccurs", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "totalDigits", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "fractionDigits", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "assertFalse", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "assertTrue", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "future", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "past", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("maxExclusive");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxExclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("minExclusive");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minExclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("maxInclusive");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxInclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("minInclusive");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minInclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("nillable");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "nillable", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "pattern", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("length");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "length", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("maxLength");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxLength", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("minLength");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minLength", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("minOccurs");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minOccurs", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("maxOccurs");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxOccurs", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("totalDigits");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "totalDigits", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("fractionDigits");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "fractionDigits", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("assertFalse");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "assertFalse", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("assertTrue");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "assertTrue", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("future");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "future", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("past");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "past", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxExclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minExclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxInclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minInclusive", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "nillable", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "pattern", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "length", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxLength", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minLength", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "minOccurs", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "maxOccurs", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "totalDigits", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "fractionDigits", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "assertFalse", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "assertTrue", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "future", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "past", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "ENUM$VALUES", "[Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType", "ENUM$VALUES", "[Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$FacetType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
