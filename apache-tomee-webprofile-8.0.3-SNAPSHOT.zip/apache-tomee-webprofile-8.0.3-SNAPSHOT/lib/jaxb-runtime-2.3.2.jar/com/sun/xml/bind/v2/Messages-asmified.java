package asm.com.sun.xml.bind.v2;
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
public class MessagesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/bind/v2/Messages", "Ljava/lang/Enum<Lcom/sun/xml/bind/v2/Messages;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ILLEGAL_ENTRY", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ERROR_LOADING_CLASS", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_PROPERTY_VALUE", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BROKEN_CONTEXTPATH", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_DEFAULT_CONSTRUCTOR_IN_INNER_CLASS", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_TYPE_IN_MAP", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_JAXP_IMPLEMENTATION", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAXP_SUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAXP_UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAXP_XML_SECURITY_DISABLED", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAXP_EXTERNAL_ACCESS_CONFIGURED", "Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "rb", "Ljava/util/ResourceBundle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/xml/bind/v2/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/xml/bind/v2/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/xml/bind/v2/Messages;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/Messages;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/Messages");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/Messages", "format", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "format", "([Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/Messages", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ILLEGAL_ENTRY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "ILLEGAL_ENTRY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ERROR_LOADING_CLASS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "ERROR_LOADING_CLASS", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_PROPERTY_VALUE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "INVALID_PROPERTY_VALUE", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_PROPERTY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BROKEN_CONTEXTPATH");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "BROKEN_CONTEXTPATH", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_DEFAULT_CONSTRUCTOR_IN_INNER_CLASS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "NO_DEFAULT_CONSTRUCTOR_IN_INNER_CLASS", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_TYPE_IN_MAP");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "INVALID_TYPE_IN_MAP", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_JAXP_IMPLEMENTATION");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "INVALID_JAXP_IMPLEMENTATION", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXP_SUPPORTED_PROPERTY");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_SUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXP_UNSUPPORTED_PROPERTY");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXP_XML_SECURITY_DISABLED");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_XML_SECURITY_DISABLED", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXP_EXTERNAL_ACCESS_CONFIGURED");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_EXTERNAL_ACCESS_CONFIGURED", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/bind/v2/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "ILLEGAL_ENTRY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "ERROR_LOADING_CLASS", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "INVALID_PROPERTY_VALUE", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "BROKEN_CONTEXTPATH", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "NO_DEFAULT_CONSTRUCTOR_IN_INNER_CLASS", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "INVALID_TYPE_IN_MAP", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "INVALID_JAXP_IMPLEMENTATION", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_SUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_XML_SECURITY_DISABLED", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/Messages", "JAXP_EXTERNAL_ACCESS_CONFIGURED", "Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/Messages;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/Messages;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ResourceBundle", "getBundle", "(Ljava/lang/String;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
