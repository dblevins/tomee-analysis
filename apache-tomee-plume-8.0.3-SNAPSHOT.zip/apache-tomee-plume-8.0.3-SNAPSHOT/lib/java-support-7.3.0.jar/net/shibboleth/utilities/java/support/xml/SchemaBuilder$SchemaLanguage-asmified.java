package asm.net.shibboleth.utilities.java.support.xml;
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
public class SchemaBuilder$SchemaLanguageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "Ljava/lang/Enum<Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "net/shibboleth/utilities/java/support/xml/SchemaBuilder", "SchemaLanguage", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XML", "Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RELAX", "Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "schemaFactoryURI", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "$VALUES", "[Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/primitive/StringSupport", "trimOrNull", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("URI cannot be null or empty");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "schemaFactoryURI", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSchemaFactory", "()Ljavax/xml/validation/SchemaFactory;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "schemaFactoryURI", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/validation/SchemaFactory", "newInstance", "(Ljava/lang/String;)Ljavax/xml/validation/SchemaFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XML");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "XML", "Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;");
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RELAX");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http://relaxng.org/ns/structure/1.0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "RELAX", "Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "XML", "Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "RELAX", "Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "net/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage", "$VALUES", "[Lnet/shibboleth/utilities/java/support/xml/SchemaBuilder$SchemaLanguage;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
