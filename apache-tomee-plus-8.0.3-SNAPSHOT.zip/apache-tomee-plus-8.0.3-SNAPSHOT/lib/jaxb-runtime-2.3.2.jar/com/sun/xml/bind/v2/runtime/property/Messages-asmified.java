package asm.com.sun.xml.bind.v2.runtime.property;
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

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/bind/v2/runtime/property/Messages", "Ljava/lang/Enum<Lcom/sun/xml/bind/v2/runtime/property/Messages;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUBSTITUTABLE_TYPE", "Lcom/sun/xml/bind/v2/runtime/property/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNEXPECTED_JAVA_TYPE", "Lcom/sun/xml/bind/v2/runtime/property/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "rb", "Ljava/util/ResourceBundle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/xml/bind/v2/runtime/property/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/xml/bind/v2/runtime/property/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/runtime/property/Messages;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/xml/bind/v2/runtime/property/Messages;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/xml/bind/v2/runtime/property/Messages;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/property/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/runtime/property/Messages;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/property/Messages");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/property/Messages", "format", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "format", "([Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/property/Messages", "name", "()Ljava/lang/String;", false);
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
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUBSTITUTABLE_TYPE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "UNSUBSTITUTABLE_TYPE", "Lcom/sun/xml/bind/v2/runtime/property/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNEXPECTED_JAVA_TYPE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "UNEXPECTED_JAVA_TYPE", "Lcom/sun/xml/bind/v2/runtime/property/Messages;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/bind/v2/runtime/property/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "UNSUBSTITUTABLE_TYPE", "Lcom/sun/xml/bind/v2/runtime/property/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "UNEXPECTED_JAVA_TYPE", "Lcom/sun/xml/bind/v2/runtime/property/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/runtime/property/Messages;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/runtime/property/Messages;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ResourceBundle", "getBundle", "(Ljava/lang/String;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/property/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
